package OOP;

public class objectarrays {
    public static void main(String[] args) {

        // Food[] refrigerator = new Food[3];

        Food food1 = new Food("Hamburger");
        Food food2 = new Food("Pizza");
        Food food3 = new Food("Cold pizza");

        Food[] refrigerator = {food1, food2, food3};

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[0]);

    }
}
