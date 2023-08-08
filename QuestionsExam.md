Q1: Which of the following are valid Java Identifiers (Choose all that Apply)

 A. A$B

 B. _hello

 C. false

 D. java.util

 E. Public

 F. 19_abs

My Answer : A, B, E
> Correct Answers : A, B, E

Q2: Which of the following are true ( choose all)

4. short myPets = 5;
5. int myNumber = 5.6;
6. String theString = "Scruffy";
7. mypets.length();
8. myNumber.length();
9. theString.length();

 A. Line 4 generates a compiler error

B. Line 5 generates a compiler error

c.Line 6 generates a compiler error

D.Line 7 generates a compiler error

E.Line 8 generates a compiler error

F.Line 9 generates a compiler error

G. The code compiles as is 

My answer: B,D,E
> Correct Answer: B,D,E

Q3:What is the output of the following program?

class WaterTank{

    private String brand;
    private boolean empty;
    public static void main(String[] args){
        WaterTank wb = new WaterTank();
        sout("Empty= "+ wb.empty);
        sout(", Brand = "+ wb.brand);
    }
}

A. Line 6 - compiler error

B. Line 7 - compiler error

c. There is no output

D. Empty = false, Brand = null

E. Empty = false, Brand = 

F. Empty = null, Brand = null

My answer: D
> Correct Answer: D

Q4: Which of the following are legal entry point methods that can be run from the command line (Choose all that apply)

A. private static void main(String[] args)

B. public static final main(String[] args)

c. public void main(String[] args)

D. public static void test(String[] args)

E. public static void main(String[] args)

F. public static main(String[] args)

G. none of the above

My answer: E
> Correct Answer: E 

Q5: What is the maximum amount of imports that can be removed and still have the code compile


package company; 

public class Employee{}

package company;

import java.lang.*;

import java.lang.System;

import company.Employee;

import company.*;

public class Company{

    public void print(Employee employee){

    sout(employee);
}
}

A. 0

B. 1

c. 2

D. 3

E. 4

F. Does not compile

My answer: E
> Correct Answer: E

Q6: Which of the following are true? ( Choose all that apply )

A. A local variable of type boolean defaults to null;

B. A local variable of type float defaults to 0;

c. A local variable of type Object defaults to null.

D. A local variable of type boolean defaults to false.

E. A local variable of type boolean defaults to true.

F. A local variable of type float defaults to 0.0.

G. None of the above

My answer: A, C //compiler error , local variables dont init
> Correct Answer: G
 
Q7: Given the following class, which of the following lines of code can replace INSERT CODE HERE to make the code compile(Choose all that apply)

public class Price{
    
    public void admission(){
    INSERT CODE HERE
    sout(amount);
}}

A. int amount = 9L;

B. int amount = 0b101;

c. int amount = 0xE;

D. double amount = 0xE;

E. double amount = 1_2_.0_0;

F. int amount = 1_2_;

G. none of the above

My answer: B, C, D
> Correct Answer: B,C,D

Q8: Which of the following are true statements(Choose all that apply)

A. Java allows operator overloading.

B. Java code compiled on Windows can run on Linux.

c. Java has pointers to specific locations in memory

D. Java is procedural language 

E. Java is object-oriented language

F. Java is a functional programming language

G. none of the above

My answer: B, E
> Correct Answer: B, E