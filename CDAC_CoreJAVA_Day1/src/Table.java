import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		
		int n,i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the table number which you want to see: ");
		
		n=s.nextInt();
		
		System.out.println("Table of given number is: ");
		
		for(i=1;i<=10;i++)
		{
			
			System.out.println(n + " x " +i+" = "+n*i);
			
			
		}
		
			s.close();
	}

}
