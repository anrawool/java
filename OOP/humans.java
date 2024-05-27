package OOP;
public class humans {
    
    public static void main(String[] args) {
        Human human = new Human("Sarthak", 13, 70.00);
        System.out.println(human.name);
        human.eat();
        human.drink();
    }
}
