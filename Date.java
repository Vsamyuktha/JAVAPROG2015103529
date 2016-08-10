package DateDemo;

public class Date {
private int date;
private int month;
private int year;
public Date()
{
	date=01;
	month=01;
	year=1900;
}
public void setDate(int d)
{
	if(d<32&&d>0)
	date=d;
}
public int getDate()
{
	return(date);
}
public void setMonth(int m)
{
	if(m<13)
		month=m;
}
public int getMonth()
{
	return(month);
}
public void setYear(int y)
{
	year=y;
}
public int getYear()
{
	return(year);
}
public void displayDate()
{
	System.out.printf("The date is %d/%d/%d",month,date,year);
}

}
