public class inheritance {
    public static void main(String[] args) {
        // fish shark=new fish();
        // shark.eat();
        // System.out.println();

        // Dog d= new  Dog();
        // d.eat();
        // d.legs=4;
       
        // System.out.println(d.legs);

        bird b= new bird();
        b.eat();
        System.out.println();
        
    }

}

//base class 
  class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }

  }

  //derived class 
//   class fish extends Animal{
//     int fins;
//     void swim(){

     
//     }

//   }


class mammal extends Animal{
    void walk(){
        System.out.println("walks");

    }

}
class fish extends mammal{
    void swim(){
        System.out.println("swim");
    }
}

class bird extends fish{
    void fly() {
        System.out.println("fly");
        
    }
}
// class Dog extends mammal{
//     String breed;
// }
  
