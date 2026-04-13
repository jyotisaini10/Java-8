public class FinancialApplication {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            System.out.println("Logged: ArithmeticException occurred.");
        }

        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            System.out.println("Logged: ArrayIndexOutOfBoundsException occurred.");
        }

       
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            System.out.println("Logged: NullPointerException occurred.");
        }
    }
}