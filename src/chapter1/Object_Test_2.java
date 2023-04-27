package chapter1;

public class Object_Test_2 {
    public static void main(String[] args) {
        // TODO 选择排序
        int[] nums = {1,4,3,5,2};

        for ( int j = 0; j < nums.length - 1; j++){
            int maxIndex = 0;
            for ( int i = 1; i < nums.length - j; i++) {
                if ( nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }

            int num1 = nums[maxIndex];
            int num2 = nums[nums.length-j-1];

            nums[maxIndex] = num2;
            nums[nums.length-j-1] = num1;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
