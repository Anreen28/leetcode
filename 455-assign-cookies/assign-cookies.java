class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);

       int gi=0;
       int si=0;
       int count =0;
       while(gi<g.length && si<s.length){
        if(s[si]>=g[gi]){
            count++;
            gi++;
        }
        si++;
        
       }
       return count;
    }
}