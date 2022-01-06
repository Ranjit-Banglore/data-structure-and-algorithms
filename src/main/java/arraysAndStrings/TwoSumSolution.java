package arraysAndStrings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSumSolution {
    public static void main(String[] args) {
        new TwoSumSolution().twoSum(new int[]{3, 2, 4}, 6);
    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        Map<Integer, Integer> map = IntStream.range(0, nums.length)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), list::get));

        for (int i = 0; i < nums.length; i++) {
            int x=nums[i];
            if(target-x==x){
                continue;
            }
            if (map.containsValue(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
        }

        return result;
    }
}
