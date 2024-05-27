
public class arrays {
    public static void main(String[] args) {
        // String[] cars = {"Camaro", "Tesla"};

        // cars[0] = "Mustang"; // Replaces the first element
        // System.out.println(cars[1]);

        String[] cars = new String[3];
        cars[0] = "Camaro";
        cars[1] = "Tesla";
        cars[2] = "Chevrolet";
        
        for (int i=0; i < cars.length; i++) {

            System.out.println(cars[i]);

        }


    } 
}
