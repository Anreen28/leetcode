class Solution {
  public int numSubarraysWithSum(int[] nums, int goal) {
    return what(nums, goal)-what(nums, goal-1);
  }
  public int what(int[] nums, int goal){
    int s;
    int e = 0;
    int sum = 0;
    int count = 0;
    for(s=0; s<nums.length;s++){
        sum+=nums[s];
        while(sum>goal && e<=s){
            sum -=nums[e];
            e++;
        }
        count += s-e+1;
    }
    return count;
  }
}
