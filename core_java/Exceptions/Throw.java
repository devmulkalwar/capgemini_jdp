public class Throw {
    public static void main(String[] args) {
        int age =17;
        if(age<18){
            throw new ArithmeticException("Invalid age input");
        }else{
            System.err.println("Valid age");
        }
    }
}
