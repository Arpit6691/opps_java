package oops;


class Student{

    //character of student

    String name;
    int rollno;
    int age;
    String college;

    //behaviour of student

    void markAttendance(){
        System.out.println("Attendance marked by "+ name);
    }
    void print(){
        System.out.println(name+ " , "+ rollno+ " , "+ age+" , "+college);
    }

}
public class class_creation_lec1 {
    public static void main(String[] args) {
   Student s1=new Student();
   Student s2=new Student();
   s1.name="Arpit";
   s1.age=23;
   s1.rollno=59;
   s1.college="KIET";

        s2.name="Pratyush";
        s2.age=21;
        s2.rollno=43;
        s2.college="KIET";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}
