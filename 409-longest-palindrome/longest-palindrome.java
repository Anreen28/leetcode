class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        boolean odd = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count % 2 == 0) {
                ans += count;
            } else {
                ans += count - 1;
                odd = true;
            }
        }
        if(odd){
            return ans+1;
        }
        return ans;
    }
}