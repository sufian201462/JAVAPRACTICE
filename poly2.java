class Vehicle{
    void startEngine(){};
    void stopEngine(){};
}

class Car extends Vehicle {
    void startEngine(){
        System.out.println("Car's Engine Starts");
    }
    void stopEngine(){
        System.out.println("Car's Engine stopped");
    }
}

class Motorcycle extends Vehicle {
    void startEngine(){
        System.out.println("Mototcycle's Engine Starts");
    }
    void stopEngine(){
        System.out.println("Motorcycle's Engine stopped");
    }
}
public class poly2 {
    public static void main(String[] args){
        Vehicle v = new Car();
        v.startEngine();
        v.stopEngine();

        v = new Motorcycle();
        v.startEngine();
        v.stopEngine();
    }
}
