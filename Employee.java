package EmployeeDemo;
public class Employee 
{
private String firstName;
private String lastName;
private double monthlySalary;
public Employee()
{
	firstName="\0";
	lastName="\0";
	monthlySalary=0.0;
}
public void setFirstName(String s)
{
	firstName=s;
}
public String getFirstName()
{
	return(firstName);
}
public void setLastName(String s)
{
	lastName=s;
}
public String getLastName()
{
	return(lastName);
}
public void setMonthlySalary(double d)
{
	if(d>0)
		monthlySalary=d;
}
public double getMonthlySalary()
{
	return(monthlySalary);
}
public double yearlySalary()
{
	double yearlySalary;
	yearlySalary=monthlySalary*12;
	return(yearlySalary);
}
public void raise()
{
	double yearlySalary;
	yearlySalary=(yearlySalary()*0.1)+yearlySalary();
	System.out.printf("The yearly salary is %f\n",yearlySalary);
}
}
