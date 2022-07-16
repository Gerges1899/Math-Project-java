/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;
import java.math.RoundingMode;
import java.util.Scanner;
/**
 *
 * @author gerge
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S=new Scanner (System.in);
        double x0,x02;
        double y0;
        System.out.println("enter the initial value of X");
        x0=x02=S.nextDouble();
        System.out.println("enter the initial value of y");
        y0=S.nextDouble();
        System.out.println("step?");
        double s=S.nextDouble();
        System.out.println("end?");
        double p=S.nextDouble();
        double x,y;
        double[]euler=new double [(int)((p-x0)/s)];
        double[]exact=new double[(int)((p-x0)/s)];
        System.out.println("the approxmate solution is");
       double h=Math.round(s*100)/100d;
        for(int i=1; i<=(p/s); i++){
            double m=func(x0,y0);     
            y=y0+h*m;
            euler[i-1]=y;
            x=Math.round((x0+h)*100)/100d;
        System.out.println("at x"+i+"= "+x+"  "+"y"+i+"= "+y);
            x0=Math.round(x*100)/100d;
            y0=y; 
        }
        double h2=Math.round(s*100)/100d;
        System.out.println("the exact solution");
          for(int i=1; i<=(p/s); i++){
              x02=Math.round((x02+h2)*100)/100d;
              double m=exact(x02);
              exact[i-1]=m;
              System.out.println("at x"+i+"= "+x02+"  "+"y"+i+"= "+m);
          }
          double error;
          System.out.println("the error of x");
          for (int i=1 ; i<=(p/s); i++){
              error=(Math.abs(exact[i-1]-euler[i-1])/exact[i-1])*100;
              error=Math.round(error*100)/100d;
              System.out.println("at x"+i+" is "+error+"%");
          }
          System.out.println("enter x test");
          double n=S.nextDouble();
          System.out.print("approxmate solution of x is ");
          double a=euler[(int)((p-n)/h)-1];
          System.out.println(a);
          System.out.print("the exact solution of x is ");
          double e=exact[(int)((p-n)/h)-1];
          System.out.println(e);
          System.out.print("the error is ");
          System.out.println(((e-a)/e)+"%");
        
    }
    public static double func(double x0,double y0){
        return (2-Math.pow(Math.E, -4*x0)-2*y0);
    }
    public static double exact(double x0){
        return 1+0.5*Math.pow(Math.E, -4*x0)-0.5*Math.pow(Math.E, -2*x0);
        
}
   
    
    
}
