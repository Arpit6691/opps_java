package oops;

public class exception {
    public static void main(String[] args) {
        int a=5;
        int b=0;
//        System.out.println(a/b);
        methodA(a,b);
        int x=9;
        int y=0;
        try{
            //risky
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            //prevntive
            System.out.println("success");
            System.out.println(e.getMessage());
        }
        finally {
            // always run
            System.out.println("always run");
        }
    }
 public  static void methodA(int a,int b){
        methodB(a,b);
    }
    public static void methodB(int a,int b){
        try {
            System.out.println(a / b);  //-> illegal - new ArithmeticException will create by jvam then it will check in the function wheather prevention is exist or not.
        }
        catch(ArithmeticException e){

            System.out.println("exception fully handled");
        }
    }
}
