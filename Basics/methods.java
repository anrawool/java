
public class methods {
    public static void main(String[] args) {
        String name = "Bro"; 
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;

        int squared = square(x, y);
        System.out.println(squared);
    }

    static void hello(String name, int age) {

        System.out.println("Hello, wassup " + name + " ?");
        System.out.println("You are " + age + " years old.");

    }

    static int square(int x, int y) {
        int z = (x+y)*(x+y);
        return z;
    }
}
