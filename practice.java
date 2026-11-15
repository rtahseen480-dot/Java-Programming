class test{
   
    static int a=10;
    static int b;
    static void changeDb(){
        b=a*3;
    }
   
    }
    
public class practice{
    public static void main(String[] args) {
        test t= new  test();
        t.changeDb();
        System.out.println(test.a+test.b);
   
    }
}
