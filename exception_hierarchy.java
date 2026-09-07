package oops;

public class exception_hierarchy {
    public static void main(String[] args) {
        //inner try handle its own exception

        try{
            System.out.println("outer try start");
            try{
                System.out.println("inner try starts");
                System.out.println(5/0);
                System.out.println("inner try ends");

            }
            catch (ArithmeticException e){
                System.out.println("divide by zero is not allowed :Inner");
            }
            System.out.println("outer try ends");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero is not allowed:outer");
        }
    }
}
