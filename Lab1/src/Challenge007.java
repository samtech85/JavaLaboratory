import java.util.Scanner;

public class Challenge007 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you name: \n");

		String name = input.nextLine();
		System.out.println("Enter you date of birth: \n");

		int birth = input.nextInt();
		int newAge = birth + 1;
		System.out.println(name + " next birthday you will be " +  newAge + " years old.");

	}

}