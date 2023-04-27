package chapter1;

public class Recursion {
    public static void main(String[] args) {
        // TODO 等差数列求和
        int result = computeAP( 20 );
        System.out.println(result);

    }

    public static int computeAP(int num){
        num = num % 2 == 0 ? num - 1 : num;
        if ( num == 1) {
            return 1;
        }else {
            return num + computeAP(num - 2);
        }
    }
}
