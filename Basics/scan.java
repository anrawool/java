
import java.util.Scanner;

class scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        System.out.println("What is your favourite food? ");
        scanner.nextLine();
        String food = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

        scanner.close();
    }
}