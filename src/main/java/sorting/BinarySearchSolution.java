package sorting;

import java.util.Arrays;

public class BinarySearchSolution {

    public static void main(String[] args) {
        int nums[] = {1, 4, 6, 8, 9,5};
        System.out.println(new BinarySearchSolution().binarySearch(nums, 9));
    }

    public boolean binarySearch(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1, mid = right/2;

        while (left <= right) {
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                right = mid-1;
            } else  {
                left = mid+1;
            }

            mid = left + (right-left) / 2;
        }

        return false;

    }
}
