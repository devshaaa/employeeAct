package shaina;


import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
          
    public static void main(String[] args) {
  
        Employee Person1 = new Employee ("Roberta Petrus ", 50000 , LocalDate.parse("2021-04-01"));
        Employee Person2 = new Employee ("Lloyd Blair ", 70000000 , LocalDate.parse("2011-09-05"));
        Employee Person3 = new Employee ("Magdalena Artemon ", 100 , LocalDate.parse ("2001-08-05"));
        
        System.out.println("Employee 1 is " + Person1.getName()+ " Salary is " + Person1.getSalary() + " " + Person1.getHireDate());
        System.out.println("Employee 2 is " + Person2.getName()+ " Salary is " + Person2.getSalary() + " " + Person2.getHireDate());
        System.out.println("Employee 3 is " + Person3.getName()+ " Salary is " + Person3.getSalary() + " " + Person3.getHireDate());
    }

}
