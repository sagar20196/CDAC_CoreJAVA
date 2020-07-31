import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		
		int n;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number between 1 and 9: ");
		n=s.nextInt();
		
		while(n<1||n>9);
		
		switch(n)
		{
		case 1: 
			System.out.println("One");
			break;
			
		case 2: 
			System.out.println("Two");
			break;
			
		case 3: 
			System.out.println("Three");
			break;
			
		case 4: 
			System.out.println("Four");
			break;
			
		case 5: 
			System.out.println("Five");
			break;
			
		case 6: 
			System.out.println("Six");
			break;
			
		case 7: 
			System.out.println("Seven");
			break;
			
		case 8: 
			System.out.println("Eight");
			break;
			
		case 9: 
			System.out.println("Nine");
			break;
	
		}
		
		s.close();

	}

}
