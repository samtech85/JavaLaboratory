import java.util.Scanner;

public class Challenge008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the total price of the bill: ");
		
		int totalPrice = input.nextInt();
		System.out.println(" How many dinners there are: ");
		int dinnersNumber = input.nextInt();
		int payment = totalPrice / dinnersNumber;
		
		System.out.println("Everyone must pay: $" + payment + " USD");
	}

}