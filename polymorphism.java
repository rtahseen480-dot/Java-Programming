public class polymorphism {
    public static void main(String[] args) {

        // calculator calc=new calculator();
        // // calc.sum(4,3);
        // System.out.println(calc.sum(5, 6));
        // System.out.println(calc.sum(1.5f, 4.9f));
        // System.out.println(calc.sum(4, 8, 9));

        deer d= new deer();
        d.eat();
        System.out.println();
        
    }
    
}
// class calculator{
//    int sum(int a,int b){
//     return a+b;
// }
// float sum(float a, float b){
//     return a+b;
// }

// float sum(float a, float b, float c ){
//     return a+b+c;
// }
// }
 

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}