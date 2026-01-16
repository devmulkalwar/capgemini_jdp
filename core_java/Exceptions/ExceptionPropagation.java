import java.io.IOException;

public class ExceptionPropagation {
    static void method1() throws IOException {
        method2();
    }

    static void method2() throws IOException {
        method3();
    }

    static void method3() throws IOException {
        throw new IOException("Disk error");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (IOException e) {
            System.out.println("Exception handled in main");
        }
    }
}
