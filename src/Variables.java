//scanner lets us read input (from the keyboard, files, etc)
import java.util.Scanner;

public class Variables {

    //this is the main method
    //for now, all code we write goes in the main method
     public static void main(String [] args) {
         //this is a print statement - outputs to the console
         System.out.print("arya");

         //"arya" is in quotes - it's a string
         //strings are values that can be words, have spaces, be numbers
         //-hold data that can be used as input or output for the program
         //-any numerical value in quotes won't be interpreted as a number for math

         //print() does not automaticaly put in a line break
         //-can use "\n" as a string for a line break
         System.out.print("\nnick");

         //println() will put in a line break AFTER the string that gets output
         System.out.println();
         System.out.println("new line");

         //variable - save and hold values for use throughout the program
         //declare a variable:
         //define the type - String
         //name the variable - username
         //assign a value - "jgreaser12"
         String username = "jgreaser12";

         //print the value of the variable
         System.out.println(username);

         //string concatenation - join strings with a +
         System.out.println("my name is " + username);

         //assign a new value to the username variable
         //-don't redeclare (using String) bc the variable was already
         //declared earlier
         username = "nick2";

         System.out.println("now my name is " + username);

         //if a var name has multiple words, can't use spaces
         //-use underscores _
         //-use camelCase
         String friendName = "charlie";

         //append (add) to a string
         // = is the assignment operator
         //evaluate the RIGHT, then assign to the LEFT
         //take the old value of friendName, add " allen" to it,
         //then save that new value back to the friendName variable
         friendName = friendName + " allen";
         System.out.println("my friend is " + friendName);

         //int is a numerical data type used to hold whole numbers
         //-can include 0 and negatives
         int num = 7;

         System.out.println("num is " + num);

         //invalid bc an int variable cannot hold a stirng value
         //num = "arya";

         //add the old value and 3, then save the evaluation back to the num var
         num = num + 3;
         System.out.println("+ 3 is " + num);

         // + is addition
         // - is subtraction
         // * is multiplication
         // / is division
         // % is modulo (mod) - remainder after division (ignore whole number)

         //3 bc 13 divided by 5 is 2 remainder 3 - mod only gives the remainder
         System.out.println("13 mod 5 is " + (13 % 5));

         System.out.println("num is " + num);
         //same as
         //num = num + 7
         num += 7;
         System.out.println("num is " + num);

         //also works with -=, *=, /=, %=

         //same as num = num + 1
         // and num += 1;
         num++; //can use num-- (no **, //, %%)
         System.out.println("num is " + num);

         //when two ints are divided, int division only
         // produces the whole number part of the division
         num = 7 / 2;

         //any decimals get truncated (cut off) in int division
         System.out.println("7 / 2 is " + num);

         //even though 99/100 might round up in math,
         //java only evaluates the whole number for int div, which is 0
         System.out.println("99 / 100 is " + (99 / 100));

         //the double data type can hold decimal values
         double numnum = 4.99;

         //to get a decimal in the division, at least one of the
         //operands needs to be a double (has a decimal)
         System.out.println(99.0 / 100);
         System.out.println(99 / 100.0);
         System.out.println(99.0 / 100.0);

         //when both operands are ints (no decimals), int division
         //is evaluated and you only get the whole number
         System.out.println(99 / 100);

         //set up a scanner to get user input
         Scanner input = new Scanner(System.in);

         System.out.println("what's your favorite whole number?");

         //get the int value that the user enters and save it to
         //the userNum variable
         int userNum = input.nextInt();
         //can also use input.nextDouble();

         //when you switch from numerical input to String input, add an extra
         //input.nextLine() otherwise it skips the user's input
         input.nextLine();

         //any lines after input.next__ won't run until AFTER the user provides input
         System.out.println(userNum + " * 10 is " + (userNum * 10));

         System.out.println("what is your password?");
         String pw = input.nextLine();

         System.out.println("your password is " + pw);

         //when you're done getting input, close the scanner
         input.close();

     }

}
