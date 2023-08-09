package academy.learnprogramming;

public class StringManip {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B "); //ta = A B
        String tb = "C ";
        ta = ta.concat(tb);// A B C
        ta.replace('C', 'D');
        ta = ta.concat(tb); // A B C C
        System.out.println(ta);
    }

    /*
A. A B C D
B. A C D
C. A B C C Most Voted
D. A B D
E. A B D C
     */
}
