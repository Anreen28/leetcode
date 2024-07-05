class Solution {
    public int[] rearrangeArray(int[] nums) {
        var i = 0;
        var j = 1;

        final var ans = new int[nums.length];

        for (final var num : nums) {
            if (num > 0) {
                ans[i] = num;
                i += 2;
            } else {
                ans[j] = num;
                j += 2;
            }
        }

        return ans;
    }
}