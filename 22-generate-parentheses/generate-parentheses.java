class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        find(ans,"",n,0,0);

        return ans;
    }
    public void find(List<String> ans,String s,int n,int open,int close){
        if(open > n || close > open ||  s.length() > 2*n){
            return;
        }
        if(open == n && close == n && s.length() == 2*n){
            ans.add(s);
        }
        find(ans,s+"(",n,open+1,close);
        find(ans,s+")",n,open,close+1);
    }
}