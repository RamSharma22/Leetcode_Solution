class Solution {
    public int removeElement(int[] a, int v) {
        int n = a.length;
        int c = 0;
        int r = 0;
        for(int i = 0;i < n;i++){
            if(v == a[i]){
                c += 1;
            }
            else{
                a[r] = a[i];
                r += 1;
            }
        }
        return n-c;
    }
}