public class NullPointerDemo {

    public static void main(String[] args) {


        System.out.println("Version A:");

        try {
            String strA = null;
            System.out.println(strA.length()); // will throw exception
        } catch (Exception e) {
            // To allow program to continue
            System.out.println("Exception: " + e);
        }


        System.out.println("\nVersion B:");

        String strB = null;

        if (strB != null) {
            System.out.println(strB.length());
        } else {
            System.out.println("No output (null handled safely)");
        }

        System.out.println("\nVersion C:");

        String strC = null;

        try {
            System.out.println(strC.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }
}