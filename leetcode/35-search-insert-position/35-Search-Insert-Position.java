class Solution {
    public int searchInsert(int[] n, int t) {
        int c = 0;
        for(int i : n){
            if(i >= t){
                return c;
            }
            c += 1;
        }
        return c;
    }
}