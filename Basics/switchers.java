
public class switchers {
   public static void main(String[] args) {
    
    // Switches can help replace a lot of if statements
    String day = "Egg";

    switch (day) {
        case "Monday":
            System.out.println("WORK");
            break;
        default:
            System.out.println("That is not a day");
            break;
    }
   } 
}
