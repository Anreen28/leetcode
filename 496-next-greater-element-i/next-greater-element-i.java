class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] m = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                   m[i]= great(nums2, j);
                }
            }
        }
        return m;
    }
    public int great(int[]nums2,int j){
        int n=-1;
        for(int i=j+1;i<nums2.length;i++){
            if(nums2[i]>nums2[j]){
                n = nums2[i];
                break;
            }
        }
        return n;
    }

}