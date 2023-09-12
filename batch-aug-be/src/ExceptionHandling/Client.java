package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("abc");
            System.out.println("Try another thing");
        } catch (FileNotFoundException e) {
            System.out.println("An exception has happened in reading");
            System.out.println("Doing more stuff");
            FileReader fileReader = new FileReader("abc");
            System.out.println("Printing from unhealthy state");
            return;
        } finally {
            boolean ans = fun();
            System.out.println("Ans from fun is " + ans);
            System.out.println("Executing the necessary statement");
        }
    }

    static boolean fun(){
        try{
            return false;
        } finally {
            System.out.println("Printing fun");
            return true;
        }
    }
}
