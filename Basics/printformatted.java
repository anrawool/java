
public class printformatted {
    public static void main(String[] args) {

        boolean MyBoolean = true;
        char myChar = '@';
        String name = "Sarthak";
        int myInt = 50;
        double myDouble = 123.4;

        System.out.printf("%c", myChar);
        System.out.printf("%b", MyBoolean);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);
        System.out.printf("%s", name);

        // System.out.printf("Hello %-10s", name); -10 gives spaces after the string

        System.out.printf("You have this much %.20f", myDouble);

        
    }
    
}
