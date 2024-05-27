
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        // Do loop executes the block of code at least once and then check the condition
        // While loop checks the conditions and then only executes the block of code.

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank()); 
        System.out.println("Hello "+ name);

        // The for loop has three options: the index, condition and increment/decrement
        for (int i=0; i<=10; i++) {
            System.out.println("Index is currently at "+ i);
        }

        scanner.close();
    
    } 
}
