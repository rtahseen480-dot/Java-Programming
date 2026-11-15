public class constructor {
    public static void main(String[] args) {
        student s1=new student();
    //     System.out.println(s1.name);
    //    System.out.println(s1.roll);
    //   student s2= new student("tahseen");
    //   student s3= new student(4);
    s1.name="tahseen";
    s1.roll=34;
    s1.password="abcd";

    s1.marks[0]=100;
    s1.marks[1]=98;
    s1.marks[2]=80;
    
     student s2= new student(s1); //copy    
     s2.password="xyz";
     s1.marks[2]=100;
     for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
     }
  
    }

}
class student{
    String name;
    int roll;
    int marks[];
    String password;


   //shallow constructor
    //  student(student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks =s1.marks;

    //  }

     //deep copy constarutor
     student(student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        
        for(int i=0; i<marks.length; i++){
            this.marks[i]=s1.marks[i];
        }

     }

     student(){
    //     this.name=name; 
    //     this.roll=roll;
        marks=new int[3];
        System.out.println("constructor is called");
     }
    student(String name){
        this.name=name;
          marks=new int[3];
    }

    student(int roll){
        
         marks=new int[3];
        this.roll=roll;
    }

  
}