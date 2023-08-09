public class Main {
    public static void main(String[] args) {
        float myNumber = 22.4F;

        //double before = 10_.25;  // does not compile
        //double after = 10._25; //does not compile
        //double first = _10.25; //does not compile
        //double last = 10.25_; //does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54F;
        double anotherDouble2 = 2.54d;  // d is optional

        double scientific = 5.000125e03;
        double scientificDouble = 5000.125;
        System.out.println("scientific =  " + scientific);
        System.out.println("scientific =  " + scientificDouble);

        // floating point deci

        double hexPi = 0x1.91e851e851fp1;

        System.out.println(hexPi);
    }
}