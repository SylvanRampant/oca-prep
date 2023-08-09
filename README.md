# oca-prep
my preperation for oca exam



>Ordering elements inside a class

| Element             | Example             | Required? | Where does it go?       |
|---------------------|---------------------|-----------|-------------------------|
| Package Declaration | package abc;        | No        | First line int the file |
| Import Statements   | import.java.util.*; | No        | Right after Package     |
| Class Declaration   | public class C      | Yes       | Right after Import      |
| Field Declarations  | int myInt;          | No        | Anywhere inside a class |
| Method Declarations | void method();      | No        | Anywhere inside a class |

> Java benefits

1. Object Oriented
2. Encapsulation
3. Platform Independent
4. Robust
5. Simple
6. Secure

> Java Primitives

| keyword | size    | examples |
|---------|---------|----------|
| boolean | -       | true     |
| byte    | 8 bits  | 2        |
| short   | 16 bits | 12       |
| int     | 32 bits | 100      |
| long    | 64 bits | 12       |
| float   | 32 bits | 123.45   |
| double  | 64 bits | 132.45   |
| char    | 16 bits | 'a'      |

> Java Operators

| Operators                        | Symbols And Examples                              |
|----------------------------------|---------------------------------------------------|
| Post-unary operators             | expression++, expression--                        |
| Pre-unary operators              | ++expression, --expression                        |
| Other unary operators            | +,-,!                                             |
| Multiplications/Division/Modulus | *,/,%                                             |
| Addition/Subtraction             | +,-                                               |
| Shift operators                  | >>,>>,>>>                                         |
| Relational operators             | <,>,<=,>=,instanceof                              |
| Equal to / not equal to          | ==,!=                                             |
| Logical operators                | &,^,  or                                          |
| Short-circuit logical operators  | &&,or or                                          |
| Ternary operators                | boolean expression ? expression1 : expression 2   |
| Assignment operators             | =, +=, -+, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>= |

> Rules to numeric promotion

    1. When two values have different data types, Java will auto promote one of the values to the 
        larger data type
    2. When one of the values is integral and the other is floating-point, Java will auto promote 
        the integral(byte, short, int, long) to the floating point (float, double) value's data type
    3. Small data types (byte, short and char) are first promoted to int any time they are used 
        with binary arithmetic operator, even when neither of the operands is int
    4. After all promotion has finished and the operands are the same data type (e.g all double) the
        result value will have the same data type as its promoted operands

> Unary operators

| Unary Operator | Description                                                  | Example                           |
|----------------|--------------------------------------------------------------|-----------------------------------|
| +              | Indicates a literal number is positive                       | x = +5 // x =5                    |
| -              | Indicates a literal number is negative or negates expression | int x = -3; // int y = -x;        |
| ++             | Increments value by 1                                        | x++ // ++x                        |
| --             | Decrements value by 1                                        | x-- // --x                        |
| !              | Inverts a boolean logical value                              | boolean b = true; boolean c = !b; |

>Truth Tables 

|          | x&&y     |         |
|----------|----------|---------|
|          | y = true | y=false |
| x= true  | true     | false   |
| x= false | false    | false   |   

|          | xORORy   |         |
|----------|----------|---------|
|          | y = true | y=false |
| x= true  | true     | true    |
| x= false | true     | false   | 


|          | x^y      |         |
|----------|----------|---------|
|          | y = true | y=false |
| x= true  | false    | true    |
| x= false | true     | false   | 

> Basic structure of IF else Statement

if(booleanExpression) 

// if keyword, () - are required

{

//curly braces are required for multiple lines of code in the if, not required for single line

} else {

//else statement is optional 

}

> Switch statement structure

switch(variableToTest){

    case constantExpression1 : 
        //branch
        break;
    case constantExpression2:
        //branch
        break;
    default:
        //branch for default
}

> switch -- keyword
>  
> () -- required
> 
> {} -- required for beginning and end
> 
> 0 or more cases
> 
> break is optional
> 
> default is optional and can appear anywhere in  switch