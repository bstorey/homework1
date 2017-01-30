/*
Import packages
*/
import java.io.Console;



/*
Create class
*/
public class Destinations {
  
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
      String[] destinations = new String[]{"Park City, UT",
                                           "Seattle, WA",
                                           "Rome, Italy",
                                           "London, UK",
                                           "Paris, FR",
                                           "Denver, CO"};
      int count = destinations.length;
      /*
      Analyze data
      */
      int multipliedNumber = count * count;
      int dividedNumber = count / count;
      int moduloNumber = count % count;
      /*
      Output
      */
      if(count > 5){
        console.printf("I have travelled the world and enjoyed it.\n\n");
      } else {
        console.printf("I need to get out more! I will make that my new year's resolution.\n\n");
      }
      
      for (int i = 0; i < destinations.length; i++) {
        console.printf("Characters in '%s': \n", destinations[i]);
        console.printf("%s\n", destinations[i].replace(" ","").replace("-","").length());
      }
      
      console.printf("\nMultiplied: %s\n", multipliedNumber);
      console.printf("Divided: %s\n", dividedNumber);
      console.printf("Modulo: %s\n", moduloNumber);
 }
}