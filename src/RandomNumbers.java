public class RandomNumbers {

    public static void main(String [] args) {

        //Math.random() produces a random double
        //between 0 and 1, exclusive of 1
        //[0, 1) --- always zero.something

        double r = Math.random();
        System.out.println(r);

        //expand the range of generated numbers to [0, 5)
        r = Math.random() * 5;
        System.out.println(r);

        //this is always 0 bc the term that gets
        //cast to an int is Math.random()
        //-since it's always 0.something, casting
        //to an int will give 0, then multiplying
        //by 5 gives 0
        int randInt = (int) Math.random() * 5;
        System.out.println(randInt);

        //use parentheses around the range expansion
        //achieved by multiplying before casting
        randInt = (int) (Math.random() * 5);
        System.out.println(randInt);

        //[1,5]
        //add one to the formula that generated [0,4]
        randInt = (int) (Math.random() * 5) + 1;
        System.out.println(randInt);

        //die roll - [1,6]
        randInt = (int) (Math.random() * 6) + 1;
        System.out.println(randInt);

        //[10, 20]
        //multiplier is how many different numbers are in
        //the desired range
        //add-on value is the minimum number in the range
        randInt = (int) (Math.random() * 11 ) + 10;
        System.out.println(randInt);

        //[3, 10]
        randInt = (int)(Math.random() * 8) + 3;
        System.out.println(randInt);

        //generalized formula for [min, max]
        //(int)(Math.random() * (max-min+1) ) + min

        //random even numbers between [50, 100]
        //since we want even numbers,
        //generate [25, 50], then multiply by 2
                                           //26
        randInt = ((int)(Math.random() * (50-25+1) ) + 25 )    * 2;
        System.out.println(randInt);


    }
}
