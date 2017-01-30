/*
Import packages
*/
import java.io.Console;
import java.util.Calendar;
import java.util.Arrays;


/*
Create class
*/
public class WhoAmI {
  
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
      String fullName;
      int age;
      String firstName = "Brian";
      String lastName = "Storey";
      int birthYear = 1982;
      int currentYear = Calendar.getInstance().get(Calendar.YEAR);
      String[] interests = new String[]{"Video Games",
                                        "Bad Movies",
                                        "Archery",
                                        "Working Out",
                                        "Beer"};
      

      /* Console prompts (retired)
      firstName = console.readLine("What is your first name?  ");
      lastName = console.readLine("What is your last name?  ");
      */
      
      /*
      Analyze data
      */
      fullName = firstName + " " + lastName;
      age = currentYear - birthYear;
      Arrays.sort(interests);
      /*
      Output
      */
      console.printf("Hello, my name is %s and I am %s years old. \n\n", fullName, age);
      console.printf("My interests are:\n"
                     + interests[0] + ",\n" 
                     + interests[1] + ",\n" 
                     + interests[2] + ",\n" 
                     + interests[3] + ",\n" 
                     + interests[4] + "\n");
 }
}