class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);

            }
            else{
                neg.add(nums[i]);
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i=i+2){
            ans[i]=pos.get(j);
            j++;
        }
        int k=0;
        for(int i=1;i<nums.length;i=i+2){
            ans[i]=neg.get(k);
            k++;
        }

        return ans;
    }
}