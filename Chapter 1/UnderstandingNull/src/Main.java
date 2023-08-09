public class Main {

    static Object myObject = new Object();
    static Object myOtherObject;
    static int myInt;
    static Integer myInteger;

    static String myString;

    public static void main(String[] args) {
        Object localObject =new Object();
        Object anotherLocalObject;
        String name = "java";
        String anotherName = null;

        System.out.println(myInt);
        System.out.println(myInteger);
        System.out.println(myObject);
        //System.out.println(anotherLocalObject);
        System.out.println(localObject);
        System.out.println(name);
        System.out.println(anotherName);
        myString = "java";
        myString.toLowerCase();
        System.out.println(myString);

    }
}