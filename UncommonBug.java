public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
            // The bug: Assuming x is modified in the finally block, it's not.
            x = 5; // This won't affect the value of x in the try block
        }
        System.out.println("x = " + x); // x will still be 10 here
    }
}