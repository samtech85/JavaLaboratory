import java.util.Scanner;


public class Challenge005 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number: \n");
		int num1 = input.nextInt();
		
		System.out.println("Please enter your second number: \n");

		int num2 = input.nextInt();
		System.out.println("Please enter your third number: \n");

		int num3 = input.nextInt();
		
		int answer = (num1 + num2)* num3;
		
		System.out.println("The answer is " + answer);
		
	}

}