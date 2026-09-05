class Solution {
    public int[][] merge(int[][] it) {
        Arrays.sort(it,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> r = new ArrayList<>();
        int s = it[0][0];
        int e = it[0][1];
        int l = it.length;
        for(int i = 1;i < l;i++){
            if(it[i][0] <= e){
                e = Math.max(e,it[i][1]);
            }else{
                r.add(new int[]{s, e});
                s = it[i][0];
                e = it[i][1];
            }
        }
        r.add(new int[]{s,e});
        return r.toArray(new int[r.size()][]);
    }
}