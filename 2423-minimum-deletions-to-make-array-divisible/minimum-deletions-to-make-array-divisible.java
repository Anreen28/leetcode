class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int res = numsDivide[0];
        for(int i=0; i <numsDivide.length;i++){
            res = gcd(res, numsDivide[i]);
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(res%nums[i]==0){
                return count;
            }
            else{
                count++;
            }
        }
        return -1;
    }
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}