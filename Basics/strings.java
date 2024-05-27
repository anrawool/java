
public class strings {
    
    public static void main(String[] args) {
        String name = "         sarthak        ";
        name = name.trim();

        boolean same = name.equals("sarthak");
        boolean sameig = name.equalsIgnoreCase("sarthAk");
        int length = name.length();
        char result = name.charAt(0);
        int position = name.indexOf("s");
        boolean empty = name.isEmpty();
        String uppername = name.toUpperCase();
        String lowername = name.toLowerCase();
        String replaced = name.replace("a", "o");

        System.out.println(replaced);
        System.out.println(result);
    }
}
