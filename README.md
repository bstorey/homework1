<b>First Part</b></br>
Make a program that will include the following items. All results should be printed to the console.

Create a variable with your first name. 
Create a variable with your last name.
Concatenate both variables and add a space in between to print out [first name] [last name]

Create a variable that shows your year of birth.
Calculate how old you are in this current year.

Concatenate the result of your full name to show the following string:
"Hello, My name is [full name] and I am [age] years old."

Create an array of interests. Please include at least 5 interests.
Iterate through all the items in the array and print out the interests.
The result of your print statement should be something similar to:

Hello, my name is....

My interests are: 
Interest 1,
Interest 2,
Interest 3,
...

Bonus points: 
Sort the array of interests first into alpha order and then print them.

<b>Solution:</b>

1. I created the java file WhoAmI.java.
2. I imported the io.Console, util.Calendar and util.Arrays packages into the file.
3. In the class WhoAmI, within the main method I declared a series of variables. These included the String fullName, int age, String firstName, String lastName, int birthYear, int currentYear (using a calendar object) and an array of strings representing my interests.
4. I had the value of fullName equal the composition of the firstName and lastName.
5. I had the value of age equal to the value of currentYear minus birthYear.
6. I utilized the Array sort method to sort the array of interests.
7. I used a console command to print out the values and each string in the array.

<b>Second Part</b></br> 
<i>Create another array of places you have visited. 
Check to see if the array of places has more than 5 places. If this is true, then print out a happy message similar to "I have travelled the world and enjoyed it". Otherwise, print "I need to get out more! I will make that my new year's resolution."

Iterate over your destination array and print out the number of characters per destination. 
Bonus points: Do not count the spaces or dashes.

Create a new variable that holds that total number of items in the destination array. 
Perform operations using the following operators: Multiplication, division and modulo.</i>

<b>Third Part</b></br> 
<i>Review the attached code and solve the marked sections. If you get some errors in your IDE, just import the following before adding your class. 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.INputsStreamReader;</i>

<b>Final Part</b></br> 
<i>Write a program that prints the numbers from 1 to 1000. Numbers that are multiples of three print "Fizz". Numbers that are multiples of 5, print "Buzz". Numbers that are multiples of both three and five, print "FizzBuzz".</i>
