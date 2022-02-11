import java.util.Scanner;
public class Challenge011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number over 100: ");
		int larger = input.nextInt();
		
		System.out.println("Enter a number under 10: ");
		int smaller = input.nextInt();
		
		int answer = larger % smaller;
		
		System.out.println(smaller + " goes into " + larger + answer + " times");
	}

}