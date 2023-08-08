public class Main {
    public static void main(String[] args) {
        int myNumber;
        //System.out.println(myNumber); // does not compile - no init
        myNumber = 10;
        System.out.println(myNumber);

        //oneline create and init
        double myDouble = 7.50;
        System.out.println(myDouble);

        float myFloat1, myFloat2, myFloat3;
        float myFloat4; float myFloat5;

        float myFloat6 = 5f, myFloat7=10f, myFloat8;

        boolean b1,b2;

        //double d1, double d2; //does not compile - 2 types one line

        int i1;
        int i2;
        //int i3; i4; // does not compile - semicolon indicates new line

        //int int =10; //does not compile - java keyword

        char Char;
        char CHar;
        // legal names
        float okFloat;
        double $okay2Doble1;
        double _alsoDouble;
        float __okayButNotNice$_123;

        //illegal names

        //double 3Dpoint; //cant start with num

        //double my@street; //@sign cant be used

        //float *#coffee; //* cannot be used

    }
}