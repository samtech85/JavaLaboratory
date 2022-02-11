import java.util.Scanner;

public class Challenge009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of day: ");
		int numberOfDays = input.nextInt();
		
		int hour = numberOfDays / 24;
		int minutes = hour / 60;
		int second = minutes/60;
		
		System.out.println("In " + numberOfDays + " days, there are :" + hour + " hours, " + minutes + " minutes, and" + second + " seconds.");
	}

}