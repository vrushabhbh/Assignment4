/*
3.    Write a program by creating an 'Employee' class having the following methods and print the final salary.
a.    'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
b.    'AddSal()' which adds $10 to salary of the employee if it is less than $500.
c.    'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
*/


package assignment_4;
import java.util.Scanner;
public class Employee {
	 private double salary;
	    private int workHoursPerDay;

		    public void getInfo(double salary, int workHoursPerDay) {
	        this.salary = salary;
	        this.workHoursPerDay = workHoursPerDay;
	    }

	    
	    public void AddSal() {
	        if (salary < 500) {
	            salary += 10;
	        }
	    }

	    
	    public void AddWork() {
	        if (workHoursPerDay > 6) {
	            salary += 5;
	        }
	    }

	    
	    public void displaySalary() {
	        System.out.println("Final salary of the employee: $" + salary);
	    }

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	    
	        Employee employee = new Employee();

	        System.out.print("Enter the salary of the employee: ");
	        double salary = scanner.nextDouble();

	        System.out.print("Enter the number of working hours per day: ");
	        int hours = scanner.nextInt();

	       
	        employee.getInfo(salary, hours);
	        employee.AddSal();
	        employee.AddWork();
	        employee.displaySalary();

	        
	    }
	}


