public class Main {
    public static void main(String[] args) {
        char ch = 'a';
 //       char ch1 = 'ab'; //does not compile
        char ch1 = '1';
        char uniChar = '\u03A9'; //uppercase greek omega
        char roman = '\u216C';
        char normalNum = 9;
        System.out.println(ch1);
        System.out.println(uniChar);
        System.out.println(roman);
        System.out.println(normalNum);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println(myBoolean);
        System.out.println(myFalseBoolean);

    }
}