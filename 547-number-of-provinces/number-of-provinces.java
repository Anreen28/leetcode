class Solution {
    public int findCircleNum(int[][] isConnected) {
        int  v = isConnected.length;
        boolean[] vis = new boolean[isConnected.length];
        ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++){
            ls.add(new ArrayList<Integer>());

        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    ls.get(i).add(j);
                    ls.get(j).add(i);
                }
            }
        }
        int ans=0;
        for(int i=0;i<v;i++){
            if(!vis[i]){
                ans++;
                df(i, vis, ls);
            }
        }
        return ans;
        
    }
    public void df(int node, boolean[] vis,ArrayList<ArrayList<Integer>> ls){
        vis[node]=true;
        for(Integer i: ls.get(node)){
            if(!vis[i]){
                df(i, vis, ls);
            }
        }
    }
}