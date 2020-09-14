import java.util.Scanner;

/**
 * a program to convert celsius into fahrenheit
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner used for input
    Scanner input = new Scanner(System.in);

    // declare and initialize a variable to store the temperature in degrees celsius
    int C = 18;

    // ask the user for the current temperature 
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");

    // declare and calculate the current temperature
    int F = (C*9)/5 +32;

    // tell the user the temperature 
    System.out.println(C + "C is the same as " + F + "F");
   
    
  }
}
