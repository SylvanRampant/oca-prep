package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        //single line comment

        /*
        Multi line comment
        *
        * multiple lines
        *
        * */
        sumCalc(1,2);
        /**
         * @param
         * @id
         * @void
         * @return
         * JAVADOC
         */

        System.out.println("Hello world!");
        System.out.println("args-size: " + args.length);

        for(int i = 0; i< args.length; i++){
            System.out.println(args[i]);
        }

    }

    /**
     *
     * @param a
     * @param b
     * @return int
     */
    public static int sumCalc(int a, int b) {
        return a+ b;
    }
}