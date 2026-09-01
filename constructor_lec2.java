package oops;

 //this keyword=it is used to call the instace variable

//employee a1=new employee();
//new is used to create the space int the heap memory ar runtime and if no space is there then it will thorugh the excpetio erro;
//employee()-> this is used to call the construcor
//  a1-> this is create the referece to the heap from the stack
// employee -> this is used to tell the type or the method

  //below  is the calling or connecting one constructor with another using the this keywords
//Student() {
//    this("Unknown");
//}
//
//Student(String name) {
//    this(name, 18);
//}
//
//Student(String name, int age) {
//    this.name = name;
//    this.age = age;
//}

class employee{

    //instance variable
    String name;
    int emp_id;
    int age;
    String company_name;

    //instance method
    void solve(){
        System.out.println(name);
    }

    // constructer no parameter
    employee(){
        this.name="arpit";
        this.emp_id=1147;
        this.age=23;
        this.company_name="kiet";
    }

    //construcor with parameter
    employee( String name,int emp_id, int age,String company_name ){
        this.name=name;
        this.emp_id=emp_id;
        this.age=age;
        this.company_name=company_name;


    }

    employee(String name){
        this.name=name;

    }
    employee( String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class constructor_lec2 {
    public static void main(String[] args) {
        employee a1=new employee();
        a1.name="Arpit patel";
        a1.emp_id=1147;
        a1.age=23;
        a1.company_name="accenture";
        System.out.println(a1);


       employee a2=new employee( "Arpit patel",1147,23,"accenture");
        System.out.println(a2.age);
        employee a3=new employee("Ayush patel");
        employee a4=new employee("Ayush patel", 23);
        System.out.println(a3.name+ a4.age);

        employee a5=new employee();
        System.out.println(a5.name);


        System.out.println(a1.name+ a1.emp_id+a1.age+a1.company_name);

    }
}
