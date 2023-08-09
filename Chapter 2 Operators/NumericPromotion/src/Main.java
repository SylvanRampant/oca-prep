public class Main {
    public static void main(String[] args) {
        //promotion = convert smaller type into bigger type (char - int)

        int x = 5;
        double y = 10.55;
        double result = x+y;

        //need cast to go back to int
        int intResult = (int) (x+y);

        System.out.println(result);

        byte b = 10;
        int c = 5;
        double d = 4.5;

        result = b+c+d;
        System.out.println(result);

        //casting is converting bigger to smaller (int - char)

        double myDouble = 5.55;
        int myInt = (int) (4+ myDouble);

        System.out.println(myInt);

        int anotherInt = 125;
        byte myByte = 15;

        intResult = anotherInt + myByte;
        System.out.println(intResult);

        byte byteResult = (byte) intResult;
        System.out.println(byteResult); //overflow

    }
}