class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        b(a,0,n);  
    }
    void b(int[] a,int j,int n){
        if(n == 1){
            return;
        }
        if(j == n-1){
            b(a,0,n-1);
            return;
        }
        else{
            if(a[j] > a[j+1]){
                int t = a[j];
                a[j] =a[j+1];
                a[j+1] = t;
            }
        }
        b(a,j+1,n);
    }
}