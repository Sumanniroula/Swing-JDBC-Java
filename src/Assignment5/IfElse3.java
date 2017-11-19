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
public class IfElse3 {
    public static void exam(){
    int obtmarks,passmarks;
    char grade = 0;
    passmarks=40;
    Scanner sc= new Scanner (System.in);
        System.out.println("enter the marks");
        obtmarks=sc.nextInt();
        if(obtmarks>=passmarks){
        if(obtmarks>=90)
            grade='A';
        else if(obtmarks>80)
                grade='B';
        else if(obtmarks>60)
            grade='C';
        else if(obtmarks>40)
            grade='D';
        System.out.println(" you passed the exam and grade is " + grade);
    }
    
    else{
            grade='E';
   
            System.out.println("you failed and the grade is"+ grade);
            
        }
    }
}
