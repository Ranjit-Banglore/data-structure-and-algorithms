package arraysAndStrings;

import java.util.*;

public class ThreeSumSolution {

    public static void main(String[] args) {
        System.out.println(new ThreeSumSolution().threeSum(new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> processed = new HashSet<>();
        Map<Integer, Integer> lookup = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (processed.add(x)) {
                for (int j = i + 1; j < nums.length; j++) {
                    int y = nums[j];
                    int z = -x - y;
                    List<Integer> item = Arrays.asList(x, y, z);
                    Collections.sort(item);
                    if (lookup.containsKey(z) && lookup.get(z) == i) {
                        result.add(item);
                    }
                    lookup.put(y, i);
                }
            }
        }
        return new ArrayList<>(result);
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
}
