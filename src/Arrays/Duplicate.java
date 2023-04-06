package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            if (numSet.contains(n)){
                return true;
            }
            numSet.add(n);
        }
        return false;
    }
}