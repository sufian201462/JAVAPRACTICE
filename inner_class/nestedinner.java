package inner_class;

class outer{
    inner i = new inner();
    static int x = 20;
    class inner{
        int y = 10;
        public void innerdisplay(){
            System.out.println(x + " "+ y);
        }
    }
    public void outerdisplay(){
        
        i.innerdisplay();
        System.out.println(i.y);
    }
}

public class nestedinner {
    public static void main(String[] args){
        outer.inner oi = new outer().new inner();

        oi.innerdisplay();
    }
}
