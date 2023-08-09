public class Main {
    public static void main(String[] args) {
        int x = 2;
        int z = 3;

        x = x* z; // 6
        x *= z; // 6*3
        System.out.println(x); //18

        //int a += 5; // cant use += as first assignment


        //Without explicit cast

        long a = 10;
        int b = 4;
        //b = b*a; //does not compile need cast;
        b *=a; //implicit casts

        System.out.println(b);


        long c = 4;
        long d = (c = 2);

        System.out.println(c); //2
        System.out.println(d); //2

        long e = 3;
        long f = 2;
        long h = 1;
        long i = e+3* (f=3) - (h-=2);
        System.out.println("e =" + e);
        System.out.println("f =" + f);
        System.out.println("h =" + h);
        System.out.println("i =" + i);
        // 3 + 3 * 3 - -1;
        // f = 3 , h =-1 e =3 i = 13

    }
}