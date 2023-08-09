package a;

import jdk.nashorn.internal.codegen.CompilerConstants;

class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}

public class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
       // c.start();      //n1
        //c.init();       //n2
    }

    /*

   What is the result?
A. Compilation fails at line n1. Most Voted
B. Initialized Started Initialized
C. Initialized Started
D. Compilation fails at line n2.
     */
}
