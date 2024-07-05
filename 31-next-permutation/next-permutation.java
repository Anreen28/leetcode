class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int b =-1;
        int g=-1;

        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                b=i-1;
                break;
            }
        }
        if(b==-1){
            rev(nums, 0);
        }

        else{
            for(int i=n-1;i>b;i--){
                if(nums[i]>nums[b]){
                    g=i;
                    break;
                }
            }
        swap(nums, b, g);
        rev(nums, b+1);
        }
    }    
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void rev(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}