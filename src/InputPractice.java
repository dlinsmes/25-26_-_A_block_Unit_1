import java.util.Scanner;

public class InputPractice {

    public static void main (String [] args) {

        //can declare variables without giving initial values
        String name;
        String color;
        int age;

        //declare a scanner to get input
        Scanner input = new Scanner(System.in);

        System.out.println("what is your name?");
        name = input.nextLine();

        System.out.println("what is your favorite color?");
        color = input.nextLine();

        System.out.println("how old are you?");
        age = input.nextInt();

        //close the scanner resource after you get all inputs
        input.close();

        System.out.println(name + " - your favorite color is "
        + color + " and you are " + age + " years old");

        //age in decades with remainder years
        //decades - use int division
        int decades = age / 10;

        //remaining years not counted as decades
        int remainder = age % 10;
        System.out.println("this is the same as " + decades + " decades and " + remainder + " years");

        //how many days is the age equivalent to
        int days = 365 * age;

        //int div to find how many leap years have passed
        days += age/4;
        System.out.println("this is the same as " + days + " days");


    }
}
