public class Opps {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setprice(35);
        System.out.println(p1.getprice());
        // p1.setColor("red");
         p1.setColor("yellow");
        System.out.println(p1.getColor());

        // p1.setprice(20);
        p1.setprice(20); 
        System.out.println(p1.getprice());
        // bankAccount b1=new bankAccount();
        // b1.username="tahseen";
        // b1.setPassword("abcd");;

    }
    
}

// class bankAccount{
//     public String username;
//     private String password;

//     public void setPassword(String pwd){
//         password=pwd;
//     }
// }

class pen{
      private String color;
     private int price;

     String getColor(){
        return this.color;

    } 
    int getprice(){
        return this.price;
    }   
    void setColor(String newColor){

        this.color=newColor;
    }

    void setprice(int newprice){
        this.price=newprice;
    }
}
// class student{
//     String name;
//     int age;
//     float percentage;
//     void calcPercentage(int phy, int math, int che){
//         percentage=(phy+math+che)/3;
//     }

// }
