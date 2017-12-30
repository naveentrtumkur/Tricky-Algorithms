//Addition of two binary numbers in java

class Solution {
    
        public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    for(int i=a.length()-1,j=b.length()-1;i>=0 || j>=0;i--,j--){
        int v1 = (i<0)?0:a.charAt(i)-'0';
        int v2 = (j<0)?0:b.charAt(j)-'0';
        int val = (v1+v2+carry)%2;
        carry = (v1+v2+carry)/2;
        sb.insert(0,(char)(val+'0'));
    }
    if(carry == 1) sb.insert(0,'1');
    return sb.toString();
}
}
