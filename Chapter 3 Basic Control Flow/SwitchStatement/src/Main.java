import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //DATA types, int short, char ,byte  + all wrappers of these classes ,String
        //LONG, float AND boolean are not supported

        int dayOfWeek = 0;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday");
                //break;
            case 1:
                System.out.println("Tuesday");
                //break;

            default:
                System.out.println("weekend");

            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;

        }

        Random random = new Random();

        int c = random.nextInt(26) + 'a'; //adding offset to prod lower case letters

        System.out.println((char) c +" " + c + " : ");
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("sometimes a vowel");
            default:
                System.out.println("consonant");
        }

        int x = 4;

        switch (x){
            case 3:
                System.out.println("asdf");
                break;
            //case x: //DOES NOT COMPILE NEED CONSTANTS not VARIABLES
            case 'K':
            //case "Test": //Cannot switch on different type
            case 4:
                System.out.println("found");
            default:
                break;

        }
    }
}