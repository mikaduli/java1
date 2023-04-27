package chapter1;

public class Object_Test_3 {
    public static void main(String[] args) {
        // TODO 数组的二分查找
        int[] nums = {1,4,3,5,2,9,14,7};

        int targetNum = 14;
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        while ( start <= end ) {
            middle = ( start + end ) / 2;
            if ( nums[middle] > targetNum) {
                end = middle - 1;
            } else if ( nums[middle] < targetNum ) {
                start = middle + 1;
            } else {
                break;
            }
        }

        System.out.println("目标数据在数组的索引不是：" + middle);
    }
}
