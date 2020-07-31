import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		
		int nou;
		double charges;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of units: ");
		nou = s.nextInt();
		if(nou<=100) {
			
			charges= nou * 1.2;
			System.out.println("Charges "+ charges);
				
		}else if(nou<=200) {
			
			charges = nou * 2.00;
			System.out.println("Charges = "+ charges);
			
		}else if(nou<=300) {
			
			charges = nou * 3.00;
		    System.out.println("Charges = "+ charges);
			
		}else {
			
			charges = nou * 5.00;
			System.out.println("Charges = "+ charges);
			
		}
			
			s.close();
		
	}

}
