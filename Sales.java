import java.util.*;
public class Sales
{
public static void main(String args[])
{
	int a[]=new int[9];
	int gross,i,salary,n;
	System.out.println("Enter the number of elements");
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	for(i=0;i<n;i++)
	{
		System.out.printf("\nEnter the %d Salespersons gross value ",i+1);
		gross=input.nextInt();
		salary=(int)(200+(gross*0.09));
		System.out.printf("\nThe salary value salesperson %d",salary);
		if(salary>=200&&salary<=299)
			a[0]++;
		if(salary>=300&&salary<=399)
			a[1]++;
		if(salary>=400&&salary<=499)
			a[2]++;
		if(salary>=500&&salary<=599)
			a[3]++;
		if(salary>=600&&salary<=699)
			a[4]++;
		if(salary>=700&&salary<=799)
			a[5]++;
		if(salary>=800&&salary<=899)
			a[6]++;
		if(salary>=900&&salary<=999)
			a[7]++;
		if(salary>1000)
			a[8]++;
	}
	System.out.printf("\nRange\t   Number salesperson\n");
	i=0;
		System.out.printf("\n200-299   %d",a[0]);
		System.out.printf("\n300-499   %d",a[1]);
		System.out.printf("\n400-499   %d",a[2]);
		System.out.printf("\n500-599   %d",a[3]);
		System.out.printf("\n600-699   %d",a[4]);
		System.out.printf("\n700-799   %d",a[5]);
		System.out.printf("\n800-899   %d",a[6]);
		System.out.printf("\n900-999   %d",a[7]);
		System.out.printf("\n1000-over %d",a[8]);
}
}
