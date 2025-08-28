import java.util.Scanner;
public class Casting {

    public static void main(String [] args) {
        //warm up - get input for two ints from the user and output
        //the evaluation of the first divided by the second
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = input.nextInt();
        System.out.println("enter another number");
        int num2 = input.nextInt();

        //int div - any decimals get truncated - cut off
        System.out.println(num1 + "/" + num2 + " is " + num1/num2);

        //at least one of the division operands needs to be a double
        //to get a decimal in the evaluation
        //-one way is to save the input as a double variable
        //-another way is to cast (convert) the int to a double
        double n1Double = num1; //ex: saves 9 as 9.0
        System.out.println(n1Double + "/" + num2 + " is " + n1Double/num2);

        //another way: cast directly in the operation with (double)intValue
        System.out.println(num1 + "/" + (double)num2 + " is " + num1/(double)num2);

        //assignment operator = evaluate the RIGHT, then assign to the left
        // 9/2 is int division bc neither 9 nor 2 have decimals so you get 4
        //saving the int value 4 to a double makes the a variable 4.0
        double a = 9 / 2;
        System.out.println("a is " + a);

        //only the term directly to the right of (double) gets cast
        //9 gets cast to 9.0 and 9.0/2 gets evaluated
        double b = (double) 9/2;
        System.out.println("b is " + b);

        //order of operations - PEMDAS
        //parentheses first - (9/2) is 4 from int division
        //then 4 gets cast to a double (4.0)
        double c = (double) (9/2);
        System.out.println("c is " + c);

        //only 2 gets cast to a double --> 9/2.0
        double d = 9 / (double) 2;
        System.out.println("d is " + d);

        //doesn't work bc an int var can't hold decimals
        //int n = 2.7;

        //can cast a double to an int and any decimals get truncated
        int n = (int)2.7;
        System.out.println("n is " + n);

        //regular rounding rule - decimal of .5 or higher goes to the next int value
        //lower than .5 stays at the same int value
        double toRound = 3.49999;

        //apply the regular rounding rule using only casting and order of ops
        //add .5 first to either bump up the whole num or keep it as is
        //THEN cast to cut off any decimals
        int rounded = (int)(toRound + 0.5);
        System.out.println(toRound + " rounded is " + rounded);


        //doubles are only an approximation of decimal numbers
        //sometimes the value is extremely close, but off
        //by a small decimal amount
        //-the behavior isn't predictable
        a = 9.7 - 2.2;
        System.out.println("9.7 - 2.2 is " + a);

        a = 9.7 - 2.1;
        System.out.println("9.7 - 2.1 is " + a);

        a = 47.49 % 1;
        System.out.println("47.49 % 1 is " + a);

        //round to a particular decimal place (want 7.5)
        a = 9.7 - 2.2;
        System.out.print(a + " rounded is ");
        //move the decimal to the desired place value to keep,
        //THEN round, then move the decimal back
        a = a * 10; //74.99999..
        int aRounded = (int)(a + .5); //75
        a = aRounded / 10.0; //use double division to get a decimal in the evaluation
        System.out.println(a);

    }
}
