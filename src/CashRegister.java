import java.util.Scanner;

public class CashRegister {

    public static void main(String [] args) {
        //user inputs a dollar and cent amount
        //outputs the minimum quantity of bills and coins to add up to that
        //amount
        //denominations:
        //bills - 100, 20, 10, 5, 1
        //coins - quarters, dimes, nickels, pennies

        //-use only concepts we've covered so far
        //only division and modulo for math operators
        //(no multiplication or subtraction)
        Scanner input = new Scanner(System.in);
        System.out.println("how much money do you want?");
        double amt = input.nextDouble();
        input.close();
        System.out.println("$" + amt + " is...");

        //start with the largest denomination first
        //the quantity of bills should be an int bc you can't have
        //a portion of a bill - take advantage of int div and truncation
        int hundreds = (int) amt / 100;
        System.out.println(hundreds + " $100 bills");
        //find the remaining amt after 100s have been accounted for
        amt = amt % 100;


    }
}
