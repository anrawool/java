package mini_projects;
import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
        
        String name = JOptionPane .showInputDialog("Type your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane .showInputDialog("Type your age"));
        JOptionPane.showMessageDialog(null, "You are  " + age + " years old");
        
        double height = Double.parseDouble(JOptionPane .showInputDialog("Type your height"));
        JOptionPane.showMessageDialog(null, "You are  " + height + "cm tall");
    }
}