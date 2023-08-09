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
 
Q9: What is the data type of x+y?

    double x = 44.25;
    float y = 3.35; // needs F

My answer: double
> Correct Answer: Does not compile

Q10: What is the data type of x*y?

    short x = 14;
    short y = 6;

My answer: int
> Correct Answer: int

Q11: What is the data type of x*y/z?

    short x = 14;
    float y = 13f;
    double z = 30;

My answer: double
> Correct Answer: double

Q12: what is the output of this code?

    int e =3;
    int f = ++e * 5 /e-- + --e;
        // 4 * 5 / 4 + 2;
    sout(e + " " + f);

My answer: e = 2 , f = 7
> Correct Answer: e = 2 , f = 7

 Q113: what is the output of this code?

    int g = 6;
    int h = 2;
    int i = ++h + --g * 3 +2 * g++ - h-- % --g;
        //3 + 5 * 3 + 2 * 5 - 3 % 5;
        //3 + 15 + 10 - 3;
        //28
        

My answer: h =2 g = 5 I = 25
> Correct Answer: h =2 g = 5 I = 25

Q14: Which of the following java operators can be used with boolean variables (choose all that apply)

A. ==

B. +

C. --

D. !

E. %

F. <=

My answer: A, D

> Correct Answer: A, D

Q15: What datatypes will allow the folowing code to compile (choose all that apply)

    byte x = 5;
    byte y = 10;
    ____ z = x+y;

A. int

B. long

C. boolean

D. double

E. short

F. byte

My answer: A, B, D

> Correct Answer: A, B, D

Q16: What change would allow the following code snippet to compile? (choose all that apply)

    3.  long x = 10;
    4.  int y = 2 * x;

A. No Change, it compiles as is

B. Cast x on line 4 to int

C. Change the data type of x on line 3 to short

D. Cast 2*x on line 4 to int 

E. Change the data type of y on line 4 to short.

F. Change the data type of y on line 4 to long.

My answer: B, C, D, F

> Correct Answer: B, C, D, F

Q17: What change would allow the following code snippet to compile? (choose all that apply)

    3.  boolean x = true, z = true;
    4.  int y = 20;
    5.  x=(y!=10) ^(z=false);
    6.  sout(x + " " + y + " " + z);

A. true, 10, true

B. true, 20, false

C. false, 20, true

D. false, 20, false

E. false, 20, true

F. The code will not compile because of line 5

My answer: B

> Correct Answer: B

Q18: What is the output of the following code?

    1.  public class ArithmeticSample{
    2.  public static void main(String[] args){
    3.  int x = 5*4%3;
    4.  sout(x);
    5.  }}

A. 2

B. 3

C. 5

D. 6

E. Code will not compile because of line 3

F. The code will not compile because of line 5

My answer: A

> Correct Answer: A

Q19: What is the output of the following code?

    3.  int c = 7;
    4.  int result = 4;
    5.  result += ++c;
    6.  sout(result);

A. 8

B. 11

C. 12

D. 15

E. 16

F. Code will not compile because of line 5

My answer: C

> Correct Answer: C