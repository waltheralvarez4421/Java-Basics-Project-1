import javax.swing.JOptionPane;

   /**
   * Walther Alvarez
   * Assignment #1
   * CISC 0500
   * The program requests the name of the user and returns with  greeting to the user
   * It then goes on to tell you the name of the program and asking what the user would like the program to do
   * The program discards the users input and lets the user know that it cannot perform the function
   */
public class DialogViewer
{
   public static void main(String [] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.print("Hello " + name + "!");
      JOptionPane.showMessageDialog(null, "My name is Hal!");
      String input = JOptionPane.showInputDialog("What would you like me to do?");
      JOptionPane.showMessageDialog(null, "I'm sorry " + name + ", I'm afraid I can't do that.");
   }
}