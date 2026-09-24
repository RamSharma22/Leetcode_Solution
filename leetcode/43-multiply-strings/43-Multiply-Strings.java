class Solution {
    public String multiply(String n1, String n2) {
        if(n1.equals("0")||n2.equals("0")){
            return "0";
        }
        int m = n1.length();
        int n = n2.length();

        int[] r = new int[n+m];

        for(int i = m-1;i >= 0;i--){
            for(int j = n-1;j >= 0;j--){
                int d1 = n1.charAt(i) - '0';
                int d2 = n2.charAt(j) - '0';

                int p = d1 * d2;

                int pos2 = i+j+1;
                int pos1 = i+j;

                int s = p + r[pos2];

                r[pos2] = s % 10;
                r[pos1] += s / 10;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int d : r){
            if(sb.length() == 0 && d == 0){
                continue;
            }
            sb.append(d);
        }
        return sb.toString();
    }
}