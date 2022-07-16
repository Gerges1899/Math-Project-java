/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos.n;

import java.util.Scanner;

/**
 *
 * @author gerge
 */
public class CosN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("enter thumber of power to be above 1");
        double n=S.nextInt();
        if(n%2!=0){
        System.out.println(Int(n));}
        else{
            System.out.println(Int2(n));
        }
    }
    public static String Int(double n){
         double A[]=new double[(int)n];
        double O[]=new double[(int)(n+2)];
        O[(int)(n+1)]=1;
        String B[]=new String[(int)n];
        B[0]="sin(x)";
        double sum=1;
        String sum2="";
        for(double i=n-1; i>0; i-=2){
            A[(int)i]=((i+1));
            
        }
        for(double j=n-1; j>0; j-=2){
            sum*=A[(int)j];
        }
        for(int g=(int)(n+1); (g-2)>0; g-=2){
            O[(g-2)]=O[(g)]*(g-2);
        }
        for(double t=n-2; t>0; t-=2){
            B[(int)t]="cos^"+String.valueOf((int)t)+"(x)"+"*"+"sin(x)"+"+"+String.valueOf((int)(O[(int)(t+1)]))+"*";
        }
        for(double l=n-2; l>0; l-=2){
            sum2+=B[(int)l];
        }
        return "("+String.valueOf(1)+"/"+String.valueOf((int)sum)+")"+"*"+"("+String.valueOf((int)(sum/(A[(int)n-1])))+"*"+sum2+B[0]+")"+"+ C ";
    }
    public static String Int2(double n){
double A[]=new double[(int)n];
        double O[]=new double[(int)(n+2)];
        O[(int)(n+1)]=1;
        String B[]=new String[(int)n];
        B[0]="(1/2 + sin(2x)/4)";
        double sum=1;
        String sum2="";
        for(double i=n-1; i>1; i-=2){
            A[(int)i]=((i+1));
            
        }
        for(double j=n-1; j>1; j-=2){
            sum*=A[(int)j];
        }
        for(int g=(int)(n+1); (g-2)>1; g-=2){
            O[(g-2)]=O[(g)]*(g-2);
        }
        for(double t=n-2; t>1; t-=2){
            B[(int)t]="cos^"+String.valueOf((int)t)+"(x)"+"*"+"sin(x)"+"+"+String.valueOf((int)(O[(int)(t+1)]))+"*";
        }
        for(double l=n-2; l>1; l-=2){
            sum2+=B[(int)l];
        }
        return "("+String.valueOf(1)+"/"+String.valueOf((int)sum)+")"+"*"+"("+String.valueOf((int)(sum/(A[(int)n-1])))+"*"+sum2+B[0]+")"+"+ C ";
        
    }
    
}
