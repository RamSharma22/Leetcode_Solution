class Solution {
    public boolean cycle(int[][] g,boolean[] v,boolean[] r,boolean[] t,int c){
        v[c] = true;
        r[c] = true;
        for(int i = 0;i < g[c].length;i++){
            int x = g[c][i];
            if(r[x]){
                t[c] = true;
                return true;
            }
            else if(!v[x]){
                if(cycle(g,v,r,t,x)){
                    t[c] = true;
                    return true;
                }
            }
        }
        r[c] = false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] g) {
        int n = g.length;
        ArrayList<Integer> a = new ArrayList<>();
        boolean[] v = new boolean[n];
        boolean[] r = new boolean[n];
        boolean[] t = new boolean[n];
        for(int i  = 0;i < n;i++){
            if(!v[i]){
                cycle(g,v,r,t,i);
            }
        }
        for(int i = 0;i < n;i++){
            if(!t[i]){
                a.add(i);
            }
        }
        return a;
    }
}