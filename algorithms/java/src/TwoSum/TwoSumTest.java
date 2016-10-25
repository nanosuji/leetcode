package TwoSum;

import java.util.Arrays;

public class TwoSumTest {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] x = {3, 2, 4};
        int[] sol = s.twoSum(x, 6);
        System.out.println(Arrays.toString(sol));
    }
}
