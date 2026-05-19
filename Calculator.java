import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)){

		while (true) {
			System.out.println("\n---- Calculator -----");
			System.out.print("Enter First Number:");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter number only:");
				sc.next();
			}
			double num1 = sc.nextDouble();

			System.out.print("Enter Second Numbers:");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter Number only:");
				sc.next();
			}
			double num2 = sc.nextDouble();
			sc.nextLine();

			System.out.println("\n---Operation---");
			System.out.println("+: Addition");
			System.out.println("-: Subtraction");
			System.out.println("*: Multiplication");
			System.out.println("/: division");
			System.out.println("5: Exit");

			System.out.print("Enter Operation:");
			char choice  = sc.next().charAt(0);
			sc.nextLine();

			if (choice == '5') {
				System.out.println("Exiting....");
				break;
			}


			double result = 0;
			boolean validOperator = true;

			switch (choice) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 == 0) {
					System.out.println("Error: Division can't divide by zero");
					validOperator = false;
				} else {
					result = num1 / num2;
				}
				break;
			default:
				System.out.println("Invalid choice:");
				break;
			}

			if (validOperator) {
				System.out.println("Answer: " + num1 + choice  + num2 + " = " + String.format("%.2f", result));
			}
		}
	}
}
}
