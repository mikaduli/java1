package chapter1;

public class FlowControl {
    public static void main(String[] args) {
        int level = 15;
        for ( int j = 0; j < level; j++) {
            for ( int i = 0; i < (level-1) - j; i++) {
                System.out.print(" ");
            }
            for ( int m = 0; m< j * 2 + 1; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
