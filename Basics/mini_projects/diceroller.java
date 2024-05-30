package mini_projects;
import java.util.Random;

public class diceroller {
    public static void main(String[] args) {
        Random random = new Random();
        int randint = random.nextInt(6)+1;
        System.out.println("Your random integer is " + randint);

        
    }
}
