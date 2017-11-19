/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Suman
 */
public class ArrayListImplementation {
    ArrayList<Employee> em = new ArrayList<Employee>();
    Employee e = new Employee();
    
    Scanner input = new Scanner(System.in);
    
    
    public void setInfo(){
        
            System.out.println("Enter Employee id: ");
            e.setId(input.nextLine());
            System.out.println("Enter name: ");
            e.setName(input.nextLine());
            System.out.println("Enter the salary: ");
            e.setSalary(input.nextLine());
            em.add(e);
            System.out.println("Do you wish to continue? Y/N");
        
            String choose = input.nextLine();
        
            if( choose.equalsIgnoreCase("y")){
                setInfo();
                }
                else{
                getInfo();
                }
        }
            

    public  void getInfo(){
            for(int i=0;i<em.size();i++){
            System.out.println("========================================");
            System.out.println("Employee: "+(i+1));
            System.out.println("Employee Id: "+e.getId());
            System.out.println("Employee Name: "+e.getName());
            System.out.println("Employee Salary: "+e.getSalary());
        
               }
}
}

