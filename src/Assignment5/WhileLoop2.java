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
public class WhileLoop2 {
    public static void loop(){
        int num,i=1,fact=1;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        while(i<=num)
        {
            fact=fact*i;
            i=i+1;
        }
        System.out.println("factorial is"+fact);
    }
    
}
