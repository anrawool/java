package mini_projects;
import java.util.Scanner;

public class hypo {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print side x: ");
        x = scanner.nextDouble();
        System.out.println("Print side y: ");
        y = scanner.nextDouble();

        z = (double) Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: " + z);
        scanner.close();

    }
}
