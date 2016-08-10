import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
   int a[]=new int[5];
   int i=0,n;
   System.out.println("\nEnter five numbers between 10 to 100");
   Scanner input=new Scanner(System.in);
 while(i<5)
   {
	   a[i]=input.nextInt();
	   n=0;
	   int j=0;
	   while(j<i)
	   {
	   if(a[j]==a[i])
	   {
		   n=n+1;
	   }
	   j++;
       }
	   if(n==0)
	   { System.out.printf("%d",a[i]);}
	   i++;
   }

	}

}
