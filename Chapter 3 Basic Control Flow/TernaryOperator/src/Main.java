public class Main {
    public static void main(String[] args) {
        //ternary

        int x = 10;

        int y;

        if (x > 5) y = 2 * x;
        else y = 4 * x;

        System.out.println(y);

        y = x > 5 ? 2 * x : 4 * x;
        // y = (x>5)? (2*x) : (4*x)
        System.out.println(y);

        // different data types + assignment will fail

        String s ;

        //s = (y<5)? 5: "string";  //Compilation error because of different data types (string cannot be assigned int value)

        int a = 1;
        int b = 1;
        int c = a<10 ? a++ : b++;

        System.out.println(a  );
        System.out.println(b  );
        System.out.println(c  );

        int d = 1;
        int e = 2;
        int f = 3;

        if (d<10){
            f = d++ <1 ? e++ : f++;  // d =2, f = 4
        }   else {
            f = (d+e) < 2? d++: e++;
        }
        System.out.println(d);//2
        System.out.println(e);//2
        System.out.println(f);//4


    }
}