
import java.util.Scanner;

public class Challenge002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String firstname;
		String surname;
		System.out.println("Please enter you first name: \n");
		
		firstname = input.nextLine();
		System.out.println("Please enter you surname: \n");
		surname = input.nextLine();
		
		System.out.println("Hello " + firstname + " " + surname);

	}

}
