

public class package1 {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);

        // int a= sc.nextInt();
        // System.out.println(a);

        // horse h= new horse();
        // h.eat();
        // h.walk();
        
        // System.out.println();
        // chicken c= new chicken();
        // c.walk();
        // System.out.println();

        // System.out.println(h.color);

        mustang m=new mustang();
      


        
    }  
}

abstract class Animal{
    String color;

    public Animal() {

        System.out.println("animal constructor called");

    }

    
    void eat(){
        System.out.println("animals eats");
    }
    abstract void walk();

}

class horse extends Animal{
    horse(){
        System.out.println("horse constructor called ");
    }


    //  void changeColor(){
    //     color="dark blue"; 
    //  }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
}

class chicken extends Animal{


    void walk(){
        System.out.println("walks on 2 legs");
    }
}