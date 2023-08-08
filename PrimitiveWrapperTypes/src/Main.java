public class Main {
    public static void main(String[] args) {
        int myInt = 10;

        //boxing
        Integer myWrapperInt = new Integer(10);


        Integer myInteger = 20;
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null;

        //int myint2= null;
        System.out.println(  myInt   );
        System.out.println(  myWrapperInt   );
        System.out.println(   myInteger  );
        System.out.println(   myInteger3  );
        System.out.println(  myInteger4   );
        System.out.println(  myInteger5   );


        //unboxing
        int myInt3 = myInteger3;
       // int myInt4 = myInteger5; //Null pointer because wrapper can be null, primitive cant be null

        //autoboxing primitive - wrapper & wrapper - primitive


        Integer myInteger7 = myInt;

        printSum(1,5);
        printSum(myInteger,myInteger3);
        printSum(1,5);
        printSum(1,5);
    }

    private static void printSum(Integer first, Integer second){
        System.out.println(first + second);
    }
}