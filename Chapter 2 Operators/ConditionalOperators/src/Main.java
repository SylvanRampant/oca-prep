public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        System.out.println(d);

        boolean e = a || b; // true
        System.out.println(e);

        int f = 4;
        boolean g = false && (f++ < 4); // f = 4  g = false

        boolean h = (f-- == 4) && !g; // f = 3  h = true
        System.out.println(f);//3
        System.out.println(g);// false
        System.out.println(h);// true

        int myInt = 3 ;
        int anotherInt = 4;
        boolean myBoolean = (myInt <=3) && (anotherInt-- ==4) || (myInt++ == 4);
        // true && true (anotherInt = 3) || //does not get executed because of or

        System.out.println(myInt); //3
        System.out.println(anotherInt); //3
        System.out.println(myBoolean);//true


        boolean x = true, z = false  ;
        int y = 20;
        x = ( y != 10) ^ (z = false);
        // true ^ false
        //x = true, z = false
        System.out.println(x);
        System.out.println(z);



    }
}