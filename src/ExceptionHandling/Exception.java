/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
/*
try{
set the statement that might throw exception
}
catch(Exception exceptionObject)
{
statement catch exception
}
*/
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author suman
 */
public class Exception {
    //public static void main(String[] args) {
        
    
    int number1;
    int number2;
    Scanner input=new Scanner(System.in);
    public void display()
    {
        
        
        System.out.println("Enter the first number:");
        number1=input.nextInt();
        System.out.println("Enter the second number:");
        number2=input.nextInt();
        int result=number2/number1;
        System.out.println("Result:"+result);
        
    }
}
