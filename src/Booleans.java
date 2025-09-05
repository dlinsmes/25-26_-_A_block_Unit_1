import java.util.Scanner;
public class Booleans {

    public static void main(String [] args) {
        //booleans hold true or false values
        boolean b = true;
        System.out.println("b is " + b);

        b = false;
        System.out.println("b is " + b);

        //! is negation - evaluate the opposite value
        //say as "NOT"
        b = !true;
        System.out.println("!true is " + b);

        //flips the current value
        b = !b;
        System.out.println("not b is " + b);

        // comparisons - >, <, >=, <= (less than or equal to)
        int x = 8;
        System.out.println("x is " + x);

        //assign a boolean expression to a boolean variable
        //(evaluate whether x is greater than 3, then assign
        //true or false to b)
        b = x > 3;
        System.out.println("x > 3: " + b);

        //expressions can be negated
        //8 is not greater than 8 --> false
        //false negated is true
        b = !(x > 8);
        System.out.println("!(x > 8) is " + b);

        //single equals = is the assignment operator
        //double equals == is a comparison
        //-check to see whether the two values are the same
        b = x == 8;
        System.out.println("x == 8: " + b);


        //not equals
        b = x != 9;
        //equivalent to
        b = !(x == 9);
        System.out.println("!(x == 9): " + b);

        //math - how to check whether x is between two values
        // 4 <= x < 10;

        //invalid in java
        //b = 4 <= x < 10;

        //use an AND operator - &&
        //-both sides of the && need to be valid standalone
        //boolean expressions
        b = 4 <= x && x < 10;
        System.out.println("4 <= x && x < 10: " + b);

        //both expressions must be true for an AND to evaluate
        //as true
        b = x < 4 && x > 10;
        System.out.println("x < 4 && x > 10: " + b);

        //OR - || - at least one of the expressions needs to be true
        b = x < 4 || x > 10;
        System.out.println("x < 4 || x > 10: " + b);

        x = 0;
        System.out.println("x is " + x);
        b = x < 4 || x > 10;
        System.out.println("x < 4 || x > 10: " + b);

        String word = "apple";
        System.out.println("word is " + word);

        //for Strings, do NOT use == - it will give
        //inconsistent results
        //-use .equals(word) instead
        b = word.equals("orange");
        System.out.println("is orange: " + b);

        //can be flipped
        b = "apple".equals(word);
        System.out.println("is apple: " + b);

        //check whether a word is NOT "apple"

        //invalid:
        //b = word.!equals("apple");

        //use .equals() and negate the whole expression
        b = !word.equals("apple");
        System.out.println("not apple: " + b);

        Scanner input = new Scanner (System.in);

        //want to prompt the user to enter "a" or "b"
        //if they do it correctly, evaluate true
        //otherwise evaluate false

        System.out.println("enter a or b: ");
        String user = input.nextLine();
        b = user.equals("a") || user.equals("b");
        System.out.println(b);

        //don't want the user to enter c, d, or e
        //-if they enter a (or b or m or fadsfa) --> true
        //-if they enter d (or c or e) --> false
        System.out.println("don't enter c or d or e");
        user = input.nextLine();
        b = !user.equals("c") && !user.equals("d") && !user.equals("e");
        System.out.println(b);

        //equivalent
        b = !(user.equals("c") || user.equals("d") || user.equals("e"));
        System.out.println(b);

        //deMorgan's law - distribute negations
        //!(A or B) is the same as !A and !B
        //and
        //!(A and B) is the same as !A or !B


        b = !(x > 8 && x <= 20);
        //same as
        b =  x <= 8 || x > 20;


    }
}
