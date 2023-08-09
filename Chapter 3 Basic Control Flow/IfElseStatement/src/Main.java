public class Main {
    public static void main(String[] args) {
        boolean b = false;
        if (!b) System.out.println(true);
        else System.out.println(false);
        
        int x = 1;
        
        if(x==1){}
        
        int testscore = 76;
        char grade;
        
        if (testscore>=90 ){
            grade = 'A';
        } else if (testscore>=80) {
            grade = 'B';
        } else if (testscore>= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);
        System.out.println(grade + grade);


        int hoursOfDay = 10;
        if (hoursOfDay < 11) System.out.println("Morning");
        else if (hoursOfDay < 17)  System.out.println("Evening");
        else System.out.println("Day");
            hoursOfDay++;
        }
}
