class Solution {
    public void nextPermutation(int[] n) {
        int m = n.length;
        int i = m-2;
        while(i >= 0 && n[i] >= n[i+1]){
            i--;
        }
        int j = m-1;
        if(i >= 0){
            while(n[j] <= n[i]){
                j--;
            }
            swap(n,i,j);
        }
        reverse(n,i+1, m-1);
    }
    public void swap(int[] n,int i,int j){
        int t = n[i];
        n[i] = n[j];
        n[j] = t;
    }
    public void reverse(int[] n,int l,int r){
        while(l < r){
            swap(n,l,r);
            l++;
            r--;
        }
    }
}