package EmployeeDemo;
import java.util.*;
	public class EmployeeDemo {
		
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		String f,l;
		double s;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter employee1 firstname,lastname and monthlysalary\n");
		f=input.next();
		l=input.next();
		s=input.nextDouble();
		e1.setFirstName(f);
		e1.setLastName(l);
		e1.setMonthlySalary(s);
		System.out.println("Enter employee2 firstname,lastname and monthlysalary\n");
		f=input.next();
		l=input.next();
		s=input.nextDouble();
		e2.setFirstName(f);
		e2.setLastName(l);
		e2.setMonthlySalary(s);
		f=e1.getFirstName();
		l=e1.getLastName();
		s=e1.getMonthlySalary();
		System.out.println("\nThe Employee2 details are:\nFirstname=" );
		System.out.println(f);
				System.out.printf("\nLastname=");
				System.out.print(l);
		System.out.printf("\nMonthlysalary=");
				System.out.print(s);
		f=e2.getFirstName();
		l=e2.getLastName();
		s=e2.getMonthlySalary();
		System.out.printf("\nThe Employee2 details are:\nFirstname=" );
		System.out.println(f);
				System.out.printf("\nLastname=");
				System.out.print(l);
		System.out.printf("\nMonthlysalary=");
				System.out.print(s);

				System.out.printf("\nThe yearly salary of the emeployee1 is %f",e1.yearlySalary());

				System.out.printf("\nThe yearly salary of the emeployee is %f",e2.yearlySalary());
		System.out.println("\nAfter 10% raise the yearly salaries of the employee becomes\n");
		e1.raise();
		e2.raise();
	}
	}
