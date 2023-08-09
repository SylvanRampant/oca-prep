public class Main {
    public static void main(String[] args) {
        int result = 3-2+2*2+3;
        System.out.println(result);

        result= 4/2 +1 - 4 *2 +10;

        System.out.println(result);

        int a = 4;
        int b = 3-2 * --a;
        System.out.println( "a =" + a);//3
        System.out.println( "b =" + b);//-3

        a= 4;
        b = 3-2*a--;
        System.out.println( "a =" + a); //3
        System.out.println( "b =" + b); //-5

        long c = 2;
        long d = 4+3* c++;

        System.out.println( "c =" + c); //3
        System.out.println( "d =" + d); //10

        result = 10 - 3 * (2+1 ) -4/ (1+3);

        System.out.println(result); //0

        int i = 10;
        int y =3 ;
        int k = i%y;
        int e = 2%10;

        System.out.println(k); // 1
        System.out.println(e); // 0


        int f = 12;
        int g = 5;
        int h = 2;

        int m = f/2 -10  % (4+3) -2 * f%g - h*3; // 6 -10% 7 -2 * 12%5-6
                                                // 6 - 3 -4-6
                                                //-7
        System.out.println(m);

    }
}