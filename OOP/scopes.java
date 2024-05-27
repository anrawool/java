package OOP;
import java.util.Random;
import java.util.Random;


public class scopes {
    
    Random random = new Random();
    int number = 0;
    scopes() {
        roll();
    }

    void roll(){

        number = random.nextInt(6) +1;

        System.out.println(number);
    }
}
