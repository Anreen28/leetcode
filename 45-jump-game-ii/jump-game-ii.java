class Solution {
    public int jump(int[] nums) {
        int a = 0, b = 0, count = 0;

        while (b < nums.length - 1) {
            int c = 0;
            for (int i = a; i <= b; i++) {
                c = Math.max(c, i + nums[i]);
            }
            a = b + 1;
            b = c;
            count++;
        }

        return count;        
    }
}