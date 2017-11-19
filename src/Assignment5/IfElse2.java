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
public class IfElse2 {
    public static void evenorodd(){
    int number;
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the number");
    number=sc.nextInt();
    if(number%2==0)
            System.out.println("number is even");
    else
            System.out.println("number is odd");
    }
}
