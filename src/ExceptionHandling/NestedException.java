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
public class NestedException {
   
    public void display()
           
    {
         Scanner input=new Scanner(System.in);
    try
        {
    int a[]=new int[5];
    for(int i=0;i<=10;i++)
    {
        a[i]=i;
    }
    
       }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The exception i caught:"+e);
        }
//        catch(RuntimeException ae)
//        {
//            int a[]=new int[10];
//            for(int i=0;i<=10;i++)
//    {
//        a[i]=i;
//    }
//        }
//    
    }
}
