
import java.util.ArrayList;

public class foreach {

    public static void main(String[] args) {
        // String[] animals = {"cat", "dog", "bird", "rat"};

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        animals.add("mouse");

        for (String i : animals) {
            System.out.println(i);
        }

    }
    
}
