
class Animal{
    void sound(){};
}

class Bird extends Animal{
    void sound(){
        System.out.println("Bird sounds Scream");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat sounds meow");
    }
}

public class poly {
    public static void main(String[] args){
        Animal a = new Bird();
        a.sound();

        a = new Cat();
        a.sound();
    }
}


