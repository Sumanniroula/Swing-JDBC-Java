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
public class IfElse1 {
    public static void exam(){
        int passingmarks;
        int obtainedmarks;
        passingmarks=40;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks:");
        obtainedmarks=sc.nextInt();
        if(obtainedmarks>=passingmarks)
            System.out.println("you are passed");
        else
            System.out.println("you are fail");
            
        
        
    }
            
    
    
}
