package oops;


class Random{
    String name;
    int age;
    int roll_no;
    String college;
    Random(String name, int age, int roll_no,String college){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
        this.college=college;
    }
    Random (Random r){
        this.name=r.name;
        this.age=r.age;
        this.roll_no=r.roll_no;
        this.college=r.college;


    }
}

class Hlo{
    int x;
     int y;
     Hlo(int x, int y){
         this.x=x;
         this.y=y;

     }
}

public class object_driveec3 {
    public static void add(Hlo l1){
        l1.x=l1.x+10;
        l1.y=l1.y+10;
    }
    public static void main(String[] args) {

        Hlo l1=new Hlo(5,9);
        System.out.println(l1.x+ " "+ l1.y);
        add(l1);
        System.out.println(l1.x+" " + l1.y);



Random r1=new Random("Arpit patel", 23, 89, "kiet");
        System.out.println(r1.name);

        Random r2=new Random(r1);  // deep copy
        Random r3=r1; // shallow copy

        //call by value;

         int x=4;
        int y=5;
        System.out.println(x+" "+ y);
        addten(r1);
        System.out.println(x+" "+ y);

    }
    public static void addten(Random r1){


    }
}
