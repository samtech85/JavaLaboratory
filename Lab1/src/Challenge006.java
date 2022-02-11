import java.util.Scanner;

public class Challenge006 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of slices of pizza you started with: \n");
		int startNum = input.nextInt();
		System.out.println("How slices of pizza you eaten: \n");
		int endNum = input.nextInt();
		
		int slicesLeft = startNum - endNum;
		System.out.println("You have " + slicesLeft + " Slices remaining");

	}

}