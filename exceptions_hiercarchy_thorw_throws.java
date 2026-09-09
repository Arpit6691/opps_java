package oops;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptions_hiercarchy_thorw_throws  {
    public static void main(String[] args)  throws  FileNotFoundException{
        checkelgibilty(-5);
        System.out.println("arpit patel");
       try{
           readfile();
       }
       catch(FileNotFoundException e){

       }

    }
    public static  void checkelgibilty(int age){
        try{
            if(age<=0){
                throw new IllegalArgumentException("Age can not be exception");
            }
            if(age>10){
                System.out.println("you are elegible to vote");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("arpt ");
            System.out.println(e.getMessage());

        }

    }
    public static void readfile() throws FileNotFoundException{
        FileReader fr=new FileReader("abc.txt");
    }
}

// custom exception

class InvalidAgeException extends  Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
