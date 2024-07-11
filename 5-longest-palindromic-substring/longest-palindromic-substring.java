class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int len =1;
        String ans = s.substring(0,1);

        for(int i=0;i<s.length();i++){
            for(int j=i+len;j<=s.length();j++){
                if(j-i>len && palin(s.substring(i,j))){
                    len =j-i;
                    ans = s.substring(i,j);
                }
            }
        }
        return ans;

    }
    public boolean palin(String ans){
        int s=0;
        int e = ans.length()-1;
        while(s<e){
            if(ans.charAt(s)!=ans.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}