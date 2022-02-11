import java.util.Scanner;


public class Challenge010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in Kg: ");
		
		double Kg = input.nextDouble();
		double pounds = Kg * 2.204;
		System.out.println(Kg + " Kg = " + pounds + " lb");
		
	}

}