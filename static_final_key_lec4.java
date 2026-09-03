package oops;

class Goo{

     String name ;
     final int lr;
     Goo(String name,int lr ){
         this.name=name;
         this.lr=lr;
     }
}

 class Animal{
     String name;
     int age;
     int rollno;
     static  String college;
     Animal(String name,int age, int rollno){
         this.name=name;
         this.age=age;
         this.rollno=rollno;


     }

     //static block

     static  {
         college="Kiet";
     }
 }
public class static_final_key_lec4 {
    public static void main(String[] args) {
        System.out.println(args.length);

        for(int i=0;i< args.length;i++){
            System.out.println(args[i]);
        }






        Animal s1=new Animal("Dog", 10,45);
      //  Animal.college="kiet";
        final int x;
        x=6;


        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(Animal.college);

        Goo g1=new Goo("Arpit patel",34);
        System.out.println(g1.name);
        System.out.println(g1.lr);
    }
}
