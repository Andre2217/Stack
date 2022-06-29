import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner input = new Scanner(System.in);

		int choice, number;
		do {
			System.out.println("1 - Push");
			System.out.println("2 - Pop");
			System.out.println("3 - Peek");
			System.out.println("4 - Show");
			System.out.println("0 - Exit");
			choice = input.nextInt();
			if (choice < 0 || choice > 4) {
				System.out.println("Wrong option");
			} else {
				switch (choice) {
				case 1:
					System.out.println("What number goes in?");
					number = input.nextInt();
					stack.push(number);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					if (stack.top == null) {
						System.out.println("Empty stack");
					} else {
						System.out.println(stack.peek());
					}
					break;
				case 4:
					if (stack.top == null) {
						System.out.println("Empty stack");
					} else {
						stack.show();
					}
					break;
				}
			}
		} while (choice != 0);
	}
}
