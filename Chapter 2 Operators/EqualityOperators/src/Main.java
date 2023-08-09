public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean c = a == b; //false
        boolean d = a != b; //true
        System.out.println("a = " + a );
        System.out.println("a = " + b );
        System.out.println("b = " + c );
        System.out.println("c = " + d);

        //boolean g = true == 5; //DOES NOT COMPILE bool == val cant
        //boolean h = false != "test"; // Does not Compile bool == string cant

        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x =false);
        System.out.println(x); // false
        System.out.println(y); // true
        System.out.println(z); // false



    }
}