/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sin.n;
import java.util.Scanner;
/**
 *
 * @author gerge
 */
public class SinN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S=new Scanner (System.in);
       System.out.println("enter the number of power to be above 1");
       double n=S.nextDouble();
       if(n%2!=0){
           System.out.println(Int(n));
       }
       else{
           System.out.println(Int2(n));
       }
    }
    public static String Int(double n){
        String sum="";
       
       for(double i=n; (i-1)>0; i-=2){
           sum+="("+String.valueOf((int)(i-1))+"/"+String.valueOf((int)i)+")"+"*";
       }
       return sum+"Sin(x) + C";
    }
     public static String Int2(double n){
        String sum="";
       
       for(double i=n; (i-1)>0; i-=2){
           sum+="("+String.valueOf((int)(i-1))+"/"+String.valueOf((int)i)+")"+"*";
       }
       return sum+"X"+" + C";
    }
}
