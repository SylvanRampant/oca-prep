//package asdf.asdf;

import java.util.*;
//correct order is package - imports - class
//any other order fails

//int myInt = 10; has to be in class scope

//public void myMethod(){} has to be in class scope


//only one public class per file, any amount of other classes

class myOtherClass{

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //void myMethod(){} cannot have one method in another method
    }
}