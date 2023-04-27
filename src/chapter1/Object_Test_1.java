package chapter1;

public class Object_Test_1 {
    public static void main(String[] args) {
        // TODO 冒泡排序
        int[] nums = {1,4,3,5,2};

        for ( int j = 0; j < nums.length - 1; j++) {
            for ( int i = 0; i < nums.length - j - 1; i++) {
                int num1 = nums[i];
                int num2 = nums[i+1];
                if ( num1 > num2 ) {
                    nums[i] = num2;
                    nums[i+1] = num1;
                }
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
