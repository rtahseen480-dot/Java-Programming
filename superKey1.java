public class superKey1 {
    public static void main(String[] args) {

        horse  h= new  horse();

        System.out.println(h.color);
        
    }
    
}
class animal{
    String color;

    public animal() {

        System.out.println("animal constructor is called");
    }
    
}
class horse extends animal{

    public horse() {
        // super();
        super.color="blue";
        System.out.println("horse constructor is called");
    }
    
}
