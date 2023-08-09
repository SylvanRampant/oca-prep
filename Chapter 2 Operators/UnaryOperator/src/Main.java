public class Main {
    public static void main(String[] args) {
        int x = +3;

        System.out.println(x);

        double y = -x;
        System.out.println(x);
        System.out.println(y);

        y = -y;
        System.out.println(y);

        boolean a = true;
        boolean b = !a;
        System.out.println(a);
        System.out.println(b);

        b = !b;
        System.out.println(b);

        //int myInt = !5; //does not compile
        //boolean myBoolean = +false; // does not compile

        //boolean z = !0; //does not compile

        //INCREMENT AND DECREMENT have higher order than + - * / ....

        int myInt =5 ;
        int otherInt = ++myInt;
        System.out.println(otherInt);

        int newInt = 5;
        int otherNewInt = newInt++;
        System.out.println(otherNewInt);

        int count = 0;

        System.out.println(count);
        System.out.println(++count);
        System.out.println(count);
        System.out.println(count--);
        System.out.println(count);
    }
}