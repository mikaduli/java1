package chapter1;

public class Object_Test {
    public static void main(String[] args) {
        // 二维数组实现九层妖塔
        int row = 9;
        int col = 2 * row - 1;

        String[][] nineTower = new String[row][col];

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                if ( j >= ( row - 1 ) - i & j <= ( row - 1 ) + i) {
                    nineTower[i][j] = "*";
                }else {
                    nineTower[i][j] = " ";
                }
            }
        }

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                System.out.print(nineTower[i][j]);
            }
            System.out.println();
        }
    }
}
