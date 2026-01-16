import java.io.FileReader;
import java.io.IOException;

public class Throws {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt"); 
        fr.read();
        fr.close();
        // int a = 10/0;
        // System.err.println(a);
    }

    static void divide()throws ArithmeticException {
         int a = 10/0;
        System.out.println(a);
    }
     public static void main(String[] args) {
        try {
            divide();
            readFile();   
        } catch (IOException e) {
            System.out.println("File not found or read error");
        }
    }
}
