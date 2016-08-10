package DateDemo;
import java.util.*;

public class DateDemo {

	
	public static void main(String[] args) {
		Date d=new Date();
		int da,m,y;
		da=d.getDate();
		m=d.getMonth();
		y=d.getYear();
		System.out.printf("\nThe Date given in constructor is %d/%d/%d",m,da,y);
Scanner input=new Scanner(System.in);
System.out.println("\nEnter The date,Month and year");
da=input.nextInt();
m=input.nextInt();
y=input.nextInt();
d.setDate(da);
d.setMonth(m);
d.setYear(y);
d.displayDate();
	}

}
