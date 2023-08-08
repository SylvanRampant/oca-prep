public class Main {
    static int myNewInt = 5;

    public static void main(String[] args) {
        int myLocalInt = 10;

        {
            int myOtherInt = 20;
            int anotherInt = 20;
            System.out.println(myOtherInt);

            System.out.println(myLocalInt + "inside code block");
        }
        System.out.println(myNewInt + "anywhere");
        //System.out.println(myOtherInt); //out of scope

        int anotherInt =40;
    }

    public static void myMethod(){
        System.out.println(myNewInt);
        //System.out.println(myLocalInt); //out of scope
    }
}