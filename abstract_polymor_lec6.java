package oops;


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
    }
}
