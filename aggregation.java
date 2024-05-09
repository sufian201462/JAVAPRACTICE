
 class Engine{
    private String type;
    public Engine(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
 class Car{
    private Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    public Engine getEngine(){
        return engine;
    }
}

public class aggregation {
    public static void main(String[] args){
        Engine engine = new Engine("v8");
        Car car = new Car(engine);

        System.out.println(car.getEngine().getType());

        engine = new Engine("v6");

        car = new Car(engine);

        System.out.println(car.getEngine().getType());
    }
}
