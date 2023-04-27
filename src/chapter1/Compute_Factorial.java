package chapter1;

public class Compute_Factorial {
    public static void main(String[] args) {
        int result = computeFactorial(10);
        System.out.println(result);
    }

    public static int computeFactorial(int num) {
        if ( num <= 1) {
            return 1;
        }else {
            return num * computeFactorial(num - 1);
        }
    }
}
