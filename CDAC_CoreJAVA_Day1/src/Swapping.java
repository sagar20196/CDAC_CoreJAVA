import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		int a,b,temp;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of a and b: ");
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.println("Before Swapping: a = " + a + " b = " + b);
		
		temp=a;
		a=b;
		b=temp;

		s.close();
		System.out.println("After Swapping: a = " + a + " b = " + b);
		
	}
	

}
