package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseThrows {
    public static void main(String[] args){
//        try {
//            FileReader fileReader = new FileReader("abc");
//        } catch (FileNotFoundException e) {
//            System.out.println("Handled the exception");
//        }
//         FileReader fileReader = new FileReader("abc");
        try {
            fun();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void fun() throws FileNotFoundException{
        FileReader fileReader = new FileReader("abc");
    }
}
