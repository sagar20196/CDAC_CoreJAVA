import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		int i,n,count=0,j;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number where you want to print: ");
		
		n=s.nextInt();
		
		System.out.println("Prime Numbers are: ");
		for(i=1;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
					
					count++;
					
				}
				
			}
			
			if(count==2)
			{
				
				System.out.println(i);
				
			}
			
		}

		s.close();
	}

}
