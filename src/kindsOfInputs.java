import java.util.Scanner;

public class kindsOfInputs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(enterValidName(input, "Please enter a valid name: "));
		System.out.println(getValidEmail(input, "Please enter a valid email: "));
		System.out.println(getValidPhoneNumber(input, "Please enter a valid phoneNumber: "));
		System.out.println(getValidDate(input, "Please enter a valid date: "));

	}


	public static String enterValidName(Scanner input, String userChoice) {

		userChoice = input.nextLine();
		String valid = "Name is valid";
		// use while loop to validate the String userChoice
		while (!userChoice.matches("[A-Z][a-zA-Z]{1,29}")) {
			System.out.println("Sorry name is not valid");
			System.out.println(userChoice);
			userChoice = input.nextLine();
		}

		return valid;

	}

	public static String getValidEmail(Scanner input, String userChoice) {

		String valid = "Email is Valid!";
		String email;
		System.out.println(userChoice);
		email = input.nextLine();

		while (!email.matches("[a-zA-Z0-9]{5,30}[@][a-zA-z]{5,10}[.][a-zA-Z]{2,3}")) {
			System.out.println("Sorry that email is not valid.");
			System.out.println(userChoice);
			email = input.nextLine();
		}
		return valid;
	}

	public static String getValidPhoneNumber(Scanner input, String userChoice) {

		String valid = "Phone Number is valid!";
		String phoneNumber;
		System.out.println(userChoice);
		phoneNumber = input.nextLine();
		while (!phoneNumber.matches("[(]\\d{3}[)]-\\d{3}-\\d{4}")) {
			System.out.println("Sorry that phoneNumber is not valid.");
			System.out.println(userChoice);
			phoneNumber = input.nextLine();
		}
		return valid;
}

	public static String getValidDate(Scanner input, String userChoice) {

		String valid = "Date is valid";
		String date;
		System.out.println(userChoice);
		date = input.nextLine();
		while (!date.matches("d{2}[/]d{2}[/]d{4}")) {
			System.out.println("Sorry that date is not valid.");
			System.out.println(userChoice);
			date = input.nextLine();
		}

		return valid;
	}
}
