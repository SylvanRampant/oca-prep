public class Main {
    public static void main(String[] args) {
        //int x = 1.0; //does not compile
        //short y = 19812345; // too big - int cant be short
        //int z = 9f; //does not compile
        //long t = 1923012345678910; // too big for int

        //fix these errors

        //casting is required for going big to small.

        int x = (int)1.0; //does not compile
        short y = (short)19812345; // too big - int cant be short
        int z = (int)9f; //does not compile
        long t = 1923012345678910L; // too big for int

        System.out.println(x);
        System.out.println(y); //prints 20473 -- overflow 19812345 is too big for short ( max 32767)
        System.out.println(z);
        System.out.println(t);

        //overflow and underflow with byte (-128 -> 127);
        byte myByte =127;
        byte mySecondByte = -128;

        System.out.println(myByte); //127
        System.out.println(mySecondByte); //-128

        myByte++;
        mySecondByte--;

        System.out.println(myByte); //-128
        System.out.println(mySecondByte); //+127

        myByte = (byte)(myByte -2);

        System.out.println(myByte); // +126

        short a = 10;
        short b = 20;
        short c =  (short)(a*b);
        System.out.println(c);

    }
}