package academy.interfaces;

public class EBook1{
    public static void main(String[] args) {
        Book b1 = new EBook();
        b1.readBook();
    }
}

interface  Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable{ //Line N1 //class Book implements Readable
    public void readBook(){}
    //LINE N2

    //public abstract void setBookMark();
}

class EBook extends  Book{ //Line N3 //abstract class Ebook extends Book{
    public void readBook(){}
    //line n4
    public void setBookMark(){}
}

/*
And given the code fragment:
Book book1 = new EBook();
book1.readBook();
Which option enables the code to compile?
>A : Replace line n1, with -- class Book implements Readable{
>B : At line n2 insert -- public abstract void setBookMark();
>C : Replace the code fragment at line n3 with -- abstract class EBook extends Book{
>D : At line n4 insert -- public void setBookMark(){}

A. Option A
B. Option B
C. Option C
D. Option D Most Voted

D - As concrete class will need to implement unimplemented interface method.

Java Abstract class can implement interfaces without even providing the implementation of interface methods
 */


