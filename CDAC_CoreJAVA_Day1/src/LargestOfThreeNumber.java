import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		 
		int a,b,c;
		
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the three numbers: ");
		 
		 a=s.nextInt();
		 b=s.nextInt();
		 c=s.nextInt();
		 
		 if(a>b&&a>c) {
			 
			 System.out.println("A is greater");
			 
		 }
		 else if(b>c) {
			 
			 System.out.println("B is greater");
			 
		 }else
			 
		 {
			 System.out.println("C is greater");
		 }

		 s.close();
		 
	}

}
