import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		
		int i,j,n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print: ");
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
		for(i=n-1;i>=0;i--)
		{
			
			for(j=0;j<=i-1;j++)
			{
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
		

	}

}
