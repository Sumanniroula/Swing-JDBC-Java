/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;



/**
 *
 * @author suman
 */
public class Exception1 {
    Scanner input = new Scanner(System.in);
    int x,y;
    int result;
    public void display()
    {
        try{
        System.out.println("Enter the first number:");
        x=input.nextInt();
        System.out.println("Enter the second number:");
        y=input.nextInt();
        result = x/y;
        System.out.println("Result:"+result);
        }
        catch(ArithmeticException obj){
            System.out.println("Number cannot be divided by zero");
        }
        /*try{
        set the statement that might might throw 
        }
        catch(Exception objection){
        to clean up
        }*/
    
}
}
