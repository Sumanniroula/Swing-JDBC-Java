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
public class WhileLoop1 {
    public static void loop(){
        int num,rem,sum=0;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
            System.out.println(sum);
    }
    
}
