package oops;

 //interface

interface   Bike{
    void gear();
    void start();
    void accerlare();


}
class Splender implements  Bike{
    public void gear(){
        System.out.println("gear");
    }
    public void start(){
        System.out.println("start");
    }
    public void accerlare(){
        System.out.println("accerale");
    }
}
class Scooty implements  Bike{
    public void gear(){
        System.out.println("gear scooty");
    }
    public void start(){
        System.out.println("start scooty");
    }
    public void accerlare(){
        System.out.println("accerale scooty");
    }
}


//abstract


 abstract class Car{
    void start(){
        System.out.println("car is started");

    }
    abstract  void accelerate();
    abstract  void brake();

}
class  fuelcar extends Car{
     void accelerate(){
         System.out.println("fuel is good ");
     }
     void brake(){
         System.out.println("brake is working propely");
     }
}
class ElectricCar extends Car{


     void accelerate(){
         System.out.println("electric gives good average");
     }
     void brake(){
         System.out.println("brake is working");
     }
}

public class abstract_polymor_lec6 {
    public static void main(String[] args) {
Car c1=new ElectricCar();
c1.accelerate();
c1.brake();

Car c2=new fuelcar();
c2.brake();
c2.accelerate();


Bike b1=new Splender();
b1.accerlare();
b1.gear();
b1.start();


        Bike b2=new Scooty();
        b2.accerlare();
        b2.gear();
        b2.start();
    }
}
