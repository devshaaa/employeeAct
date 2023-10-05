
package shaina;

import java.time.LocalDate;

public class Employee {

   String name;
   int Salary;
   LocalDate hireDate;
   
   String getName(){
    return name;
}
   int getSalary(){
       return Salary;
   }
   LocalDate getHireDate(){
       return hireDate;
   }
   public Employee (String name, int Salary, LocalDate hireDate){
       this.name = name;
       this.Salary = Salary;
       this.hireDate = hireDate;
       
   }
}

   