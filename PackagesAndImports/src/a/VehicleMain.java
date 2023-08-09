package a;

class Vehicle {
    String type = "4w";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    Vehicle() {

    }
}

class Car extends Vehicle {
    String trans;

    Car(String trans) {                             //n1
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {  //n2
        super(type, maxSpeed);
        this.trans = trans;
    }
}

public class VehicleMain {


    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4w", 10, "Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }

    /*
A. 4W 100 Auto 4W 10 Manual
B. null 0 Auto 4W 10 Manual
C. Compilation fails only at line n1
D. Compilation fails only at line n2
E. Compilation fails at both line n1 and line n2
     */
}
