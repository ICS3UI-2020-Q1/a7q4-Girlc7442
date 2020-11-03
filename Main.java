/**
 * displays the last digit of a number
 * @author Cole Girling
 */
public class Main {

  public static int lastDigit(int number){
    //if the number is negative this will make it positive
    if(number < 0){
      number = number * -1;
    }

    //separates the last digit of the number from the rest
    int last = number % 10;
    //returns the last digit of the number
    return last;

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ////calls the method and inserts the number into the method
    int last = lastDigit(-973);
    
    //prints the last digit to the screen
    System.out.println(last);
    
  }
}
