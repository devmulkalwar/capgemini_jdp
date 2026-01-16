public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int[] arr = {1,2,3,4};
            String name = null;
            int result = a / b;
            System.out.println("Result: " + result);

            System.out.println("4th element of Array: " + arr[5]);

            System.out.println("The length of string is "+ name.length());

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }catch(Exception e){
            System.out.println("Automatically catches exception if not specified");
        } finally {
            System.out.println("Execution completed");
        }
    }

}
