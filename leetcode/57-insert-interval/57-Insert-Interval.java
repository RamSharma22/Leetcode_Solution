class Solution {
    public int[][] insert(int[][] it, int[] ni) {
        List<int[]> a = new ArrayList<>();
        int n = it.length;
        int i = 0;

        while(i < n && it[i][1] < ni[0]){
            a.add(it[i]);
            i++;
        }

        while(i < n && it[i][0] <= ni[1]){
            ni[0] = Math.min(it[i][0],ni[0]);
            ni[1] = Math.max(it[i][1],ni[1]);
            i++;
        }
        a.add(ni);

        while(i < n){
            a.add(it[i]);
            i++;
        }
        return a.toArray(new int[a.size()][]);
    }
}