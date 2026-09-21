class Solution {
    public boolean isSubsequence(String s, String t) {
     int pt1 = 0;
     int pt2 = 0;
     int n1 = s.length();
     int n2 = t.length();
     while(pt1<n1 && pt2<n2){
        if(s.charAt(pt1)==t.charAt(pt2))
        {
            pt1++;
            pt2++;
        }else{
            pt2++;
        }
     }
     return pt1==n1;
    }
}