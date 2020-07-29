import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		
		int m,n,rev=0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		m=s.nextInt();
		
		while (m>0)
			
		{
			
			n=m%10;
			rev=rev*10+n;
			m=m/10;
			
		}
		
		s.close();
		
		System.out.println("Reversed number is: "+rev);

	}

}
