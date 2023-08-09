public class Main {
    public static void main(String[] args) {
        //Objects .eqauls
        //primitives ===

        //comparing objects
        Integer myInteger = 127;
        Integer myAnotherInteger = 127;

        System.out.println(myInteger == myAnotherInteger);

        System.out.println("128 == 128: " + (128 == 128));
        myInteger = 128;
        myAnotherInteger = 128;

        System.out.println("my integer = " + myInteger);
        System.out.println("my other integer = " + myAnotherInteger);

        System.out.println(myInteger == myAnotherInteger); // false why?

        /*
        Integers between (-128, 127) are in a cache, thus if you declare an integer as Integer i = 127,
        it points to the same in memory location as the one in the cache, thus 2 integers being compared
        in that range with ==, will return true.

        OUTSIDE of that range == will be false, because they will be new Integer (123213) and thus each have
        their own in memory location, and not one that is cached.
         */

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println(int1 == int2);//false
        System.out.println(int1 == int3);//false
        System.out.println(int2 == int3);//false
        System.out.println(int1.equals(int2));//true
        System.out.println(int1.equals(int3));//true
        System.out.println(int2.equals(int3));//true

        String s1 = "java";
        String s2 = new String("java");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); //true
    }
}