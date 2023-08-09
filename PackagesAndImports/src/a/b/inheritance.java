package a.b;

abstract class Planet {
    protected void revolve() { //n1

    }

    abstract void rotate();    //n2

}

public class inheritance extends Planet {
//    void revolve() {         //n3
//
//    }

    protected void rotate() { //n4

    }

    /*
A. Make the method at line n1 public.
B. Make the method at line n2 public.
C. Make the method at line n3 public.
D. Make the method at line n3 protected.
E. Make the method at line n4 public.

C&D

Cannot reduce the visibility of the inherited method from an abstract class.
In this case, can't change resolve from
protected > default
But you can change it to
protected > protected
protected > public
     */
}


