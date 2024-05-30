package OOP;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0.");
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("This will always print.");
            scanner.close();
        }
    }
}
