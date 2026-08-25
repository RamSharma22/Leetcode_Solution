class Solution {
    public int missingMultiple(int[] n, int k) {
        List<Integer> a = new ArrayList<>();
        int m = n.length;
        for(int i = 0;i < m;i++){
            a.add(n[i]);
        }
        for(int i = 1;i <= m;i++){
            int ml = k*i;
            if(!a.contains(ml)){
                return ml;
            }
        }
        return k*(m+1);

    }
}