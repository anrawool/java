
public class overload {
    public static void main(String[] args) {

        System.out.println(add(12, 23));
        System.out.println(add(12, 23, 23));
    }

    static int add(int a, int b) {
        return a+b;
    }

    static int add(int a, int b, int c) {
        return a+b+c;
    }
    
}
