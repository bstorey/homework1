/*
Import packages
*/
import java.io.Console;



/*
Create class
*/
public class FizzBuzz {
  
/*
?
*/
    public static void main(String[] args) {
      
      /*
      Create new console object
      */
      Console console = System.console();
      
      /*
      Declare variables
      */
      int number = 1;

      /*
      Analyze data
      */

      /*
      Output
      */
      while(number <= 1000){
        if(number % 3 == 0 && number % 5 == 0){
          System.out.print("FizzBuzz\n");
          number++;
        } else if(number % 3 == 0){
          System.out.print("Fizz\n");
          number++;
        } else if(number % 5 == 0){
          System.out.print("Buzz\n");
          number++;
        } else {
          System.out.print(number + "\n");
          number++;
        }
      }
 }
}