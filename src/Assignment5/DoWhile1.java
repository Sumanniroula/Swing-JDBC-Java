/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author Suman
 */
public class DoWhile1 {
    public static void loop(){
        int a=0,b=1,c,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth term");
        n=sc.nextInt();
        System.out.println("fibonacci series are");
        System.out.println(a);
        System.out.println(b);
        
                c=a+b;
                do
                {
                    System.out.println(c);
                    a=b;
                    b=c;
                    c=a+b;
                }while(c<=n);
    }
    
}
