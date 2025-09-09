public class U1Practice {

    public static void main(String [] args) {
        //warmup
        //set up int a to be random [10,20]
        //set up int b to be random [10,20]
        //print out each
        //swap the values between a and b
        //print the swapped values
        int a = (int)(Math.random() * 11 + 10);
        int b = (int)(Math.random() * 11) + 10;
        System.out.println("a is " + a + ", b is " + b);

        //this will lose the original value of a
        //a = b;
        //b = a;

        int temp = a;
        //start the next line with the
        // last used variable from the previous lin
        a = b;
        b = temp;
        System.out.println("a is " + a + ", b is " + b);

        temp = b;
        b = a;
        a = temp;
        System.out.println("a is " + a + ", b is " + b);

        int x = 8;
        boolean c = !( x > 3 && x%4 == 0);
        // DeMorgan equivalent:
        //find each opposite expression and flip and/or
        c = x <= 3 || x%4 != 0;


        //order of ops: PEMDAS
        // *, /, % have the same priority --> evaluate left to right
        // +, - have the same priority --> left to right
        a = 9 + 7 / 2 - 3 * 3;
        //= 9 +   3   - 9
        //=3;
        System.out.println(a);

        //parentheses first
        a = (9 + 7) / 2 - 3 * 3;
        System.out.println(a);

        //both ints
        a = 10;
        b = 3;

        //right side first: int div of 10/3 --> 3
        //assigning 3 to a double variable will cast to a double --> 3.0
        double d = a/b;
        System.out.println("d is " + d);

        //only the term directly to the right of (double) gets cast
        d = (double)a/b;
        System.out.println("d is " + d);

        d = a/(double)b;
        System.out.println("d is " + d);

        //parentheses first
        d = (double)(a/b);
        System.out.println("d is " + d);







    }
}
