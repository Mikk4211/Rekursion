public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Resultatet er " + factorial(5));
    }

    public static int factorial(int n) {
        int resultat = 0;

            if (n == 1) {
                return 1;
            } else {
                return n + factorial(n-1);
            }
        }
    }

