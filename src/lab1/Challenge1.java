package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    private static final String NO_NAME = "No name is provied, please provide a valid name.";
    private static final String NO_SPACE = "You must have a space between your first and last name.";

    public static void main(String[] args) throws InterruptedException {
        displayName();
    }
    
    public static void displayName() {
         try {
               String fullName = JOptionPane.showInputDialog("Enter full name:");
               String lastName = Challenge1.extractLastName(fullName);
               String msg = "Your last name is: " + lastName;
               JOptionPane.showMessageDialog(null, msg);
          } catch (IllegalArgumentException ie) {
               JOptionPane.showMessageDialog(null, ie.getMessage());
               displayName();
          }   
    }
    
    public static String extractLastName(String fullName)
            throws IllegalArgumentException {
        if (fullName == null || fullName.length() == 0) {
            throw new IllegalArgumentException(NO_NAME);
        } else if (!(fullName.contains(" "))) {
            throw new IllegalArgumentException(NO_SPACE);
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[LAST_NAME_IDX];
    }

}