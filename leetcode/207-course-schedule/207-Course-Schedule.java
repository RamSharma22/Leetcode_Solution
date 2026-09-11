class Solution {
    public boolean cycle(ArrayList<Integer> g[],boolean[] r,boolean[] v,int c){
        v[c] = true;
        r[c] = true;
        for(int i = 0;i < g[c].size();i++){
            int e = g[c].get(i);
            if(r[e] == true){
                return true;
            }
            else if(!v[e]){
                if(cycle(g,r,v,e)){
                    return true;
                }
            }
        }
        r[c] = false;
        return false;
    }
    public boolean canFinish(int n, int[][] p) {
        boolean[] r = new boolean[n];
        boolean[] v = new boolean[n];
        ArrayList<Integer> g[] = new ArrayList[n];
        for(int i = 0;i < n;i++){
            g[i] = new ArrayList<>();
        }
        for(int i = 0;i < p.length;i++){
            g[p[i][0]].add(p[i][1]);
        }
        for(int i = 0;i < n;i++){
            if(!v[i]){
                if(cycle(g,r,v,i)){
                    return false;
                }
                
            }
        }
        return true;
    }
}