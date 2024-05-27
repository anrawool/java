
public class multidim {
    public static void main(String[] args) {
        String[][] cars = {
            {"Camaro", "Tesla", "Chevrolet"},
            {"Camaro", "Tesla", "Chevrolet"},
        };
        // System.out.println(cars[0][0]);
        String[][] bikes = new String[2][2];
        bikes[0][0] = "Something";
        bikes[0][1] = "New";
        bikes[1][0] = "Apple";
        bikes[1][1] = "Banana";

        for (int i=0; i<cars.length; i++) {
            System.out.println();
            for (int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            } 
        }



    }
}
