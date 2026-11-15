public class static1 {
    public static void main(String[] args) {
        student s1=new  student();
        s1.schoolName="mvc";

        student s2=new student();
       System.out.println(s2.schoolName);

       student s3= new  student();
        s3.schoolName="abc";
        
    }
    
}
class student{
    static int returnPercentage(int math, int phy, int che){
        return (math+phy+che)/3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;

    }
    String getName(){
        return this.name;

    }
}
