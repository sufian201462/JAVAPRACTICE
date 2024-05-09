class CPU{
    public void process(){
        System.out.println("CPU is processing task");
    }
}

class computer{
    CPU c;
    public computer(){
       this.c = new CPU();
    }
    public void startComputer(){
        c.process();
        System.out.println("computer has started");
    }
}

public class composition {
    public static void main(String[] args){

        computer c = new computer();
        c.startComputer();
    }
}
