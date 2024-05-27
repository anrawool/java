package OOP;
public class overload_constructors {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("thin crust","tomato", "mozzarella", "jalepeno");
        Pizza newpizza = new Pizza("thin crust","tomato", "mozzarella");

        System.out.println("Your pizza specifications: ");

        System.out.println(newpizza.bread);
        System.out.println(newpizza.sauce);
        System.out.println(newpizza.cheese);
        System.out.println(newpizza.topping);
    }
}

