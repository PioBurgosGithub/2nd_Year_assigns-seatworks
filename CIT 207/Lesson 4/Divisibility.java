import java.util.Scanner;
public class Divisibility {

	static void divisibleBy3(int number) {
		System.out.println("\nDivisible by 3: ");		
		for (int i=1; i<=number; i++) {
			if (i%3==0){ 
			System.out.print(i +", ");
            }  			
		}		
	}

	static void divisibleBy5(int number) {
		System.out.println("\n\nDivisible by 5: ");
		for (int i=1; i<=number; i++) {
			if (i%5==0) {
                System.out.print(i +", ");	
            }		
		}
	}

	static void divisible_3_and_5(int number) {
		System.out.println("\n\nDivisible by 3 & 5: ");			
		for (int i=1; i<=number; i++) {
			if (i%3==0 && i%5==0) {
                System.out.print(i +", ");}
		}
	}

	static void notDivisible_3_and_5(int number) {
		System.out.println("\n\nNot Divisible by 3 & 5: ");			
		for (int i = 1; i <= number; i++) {
			if (i%3 != 0 && i%5 != 0) {
                System.out.print(i +", ");
            }
		}
	}

	public static void main(String args[]) {
        int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number and check if it is divisible by 3 or 5: ");
		number = input.nextInt();

		divisibleBy3(number);
		divisibleBy5(number);
		divisible_3_and_5(number);
		notDivisible_3_and_5(number);
		System.out.println("\n");
		input.close();
    }
}
