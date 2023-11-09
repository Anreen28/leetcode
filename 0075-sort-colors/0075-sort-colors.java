class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int blue=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            red++;
            else if(nums[i]==1)
            white++;
            else
            blue++;

        }
        int x=0;
        for(int i=1;i<=red;i++){
            nums[x++]=0;
        }
        for(int i=1;i<=white;i++){
            nums[x++]=1;
        }
        for(int i=1;i<=blue;i++){
            nums[x++]=2;
        }

    }
}