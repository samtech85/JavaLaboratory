import java.util.Scanner;

public class Challenge004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Please enter your first number:\n ");
		num1 = input.nextInt();
		System.out.println("Please enter your second number:\n ");
		num2 = input.nextInt();
		int answer = num1 + num2;
		System.out.println("The answer is: " + answer);
	}

}