class Solution {
    public String convert(String s, int nr) {
        int n = s.length();
        if(nr == 1 || nr >= n) return s;
        StringBuilder sb = new StringBuilder();
        int cy = nr*2 - 2;
        for(int i = 0;i < nr;i++){
            for(int j = 0; j+i < n;j += cy){
                sb.append(s.charAt(j+i));
                if(i != 0 && i != nr -1 && j+cy-i < n){
                    sb.append(s.charAt(j+cy-i));
                }
            }
        }
        return sb.toString();
    }
}