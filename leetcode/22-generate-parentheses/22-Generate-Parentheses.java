class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> t = new ArrayList<>();
        String s = "";
        int l = 0,r = 0;
        sol(n,s,l,r,t);
        return t;
    }
    public void sol(int n,String s,int l,int r,List<String> t){
        if(s.length() == n*2){
            t.add(s);
            return;
        }
        if(l < n){
            sol(n,s+"(",l+1,r,t);
        }
        if(r < l) {
            sol(n,s+")",l,r+1,t);
        }

    }
}