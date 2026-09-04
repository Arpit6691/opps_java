package oops;

 //encapsualtion

   class Student1{
       private  String name;
       private  int rollNumber;
       private  int age;
       private  String college;
  Student1(String name, int rollNumber,int age, String college){
      this.name=name;
      this.age=age;
      this.rollNumber=rollNumber;
      this.college=college;
  }
  public String getName(){
      return name;

  }
  public void setName(String name){
      this.name=name;
  }
   }
 class BankAccount{
    private double balance;
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    //getter/setters
    public double getBalance(){
        return  balance;
    }
 }

 //inheritance;

class Arpit{
       void gree(){
           System.out.println("arpit is a godd");
       }
}
class ayush extends  Arpit{
       void  pride(){
           System.out.println("he is an danger boy");
       }
}

class har extends Arpit{
       void good(){
           System.out.println("gonfe");
       }
}



public class encapsulation_inthertance_lec5 {
    public static void main(String[] args) {
BankAccount b1=new BankAccount();
//b1.balance=100.00;

        b1.deposit(500);
        b1.withdraw(300);

        System.out.println(b1.getBalance());

    }
}
