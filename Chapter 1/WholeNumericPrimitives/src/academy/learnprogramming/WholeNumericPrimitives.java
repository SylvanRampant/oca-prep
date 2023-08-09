package academy.learnprogramming;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        long max = 32_123_456_789L;
        //long n = _2;
        //long n = 2_;

        //octal base (0->7)
        int i = 07;
        int firstOct = 010;

        int secondOct = 022;

        int sumOct = firstOct + secondOct;
        System.out.println("first= " + firstOct + "second = " + secondOct);

        System.out.println("decimal sum =" + sumOct + "octSum =" + Integer.toOctalString(sumOct));

        //hexadecimal
        int firstHex = 0xF;
        int secondHEex = 0x1E;

        int sumHex = firstHex + secondHEex;

        System.out.println("first num =" + firstHex + "second hex =:" + secondHEex);
        System.out.println("decimal = "+ sumHex + "hexa+ " + Integer.toHexString(sumHex));

        //binary
        int firstBin = 0b1001;
        int secondBin = 0b0111;
        int sumBin = firstBin+secondBin;

        System.out.println("firstbin = "+ firstBin + "second bin = "+ secondBin);
        System.out.println("decimal = "+ sumBin + "binary " + Integer.toBinaryString(sumBin) );
    }
}
