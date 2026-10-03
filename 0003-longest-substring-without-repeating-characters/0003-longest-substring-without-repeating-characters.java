class Solution {
    public int lengthOfLongestSubstring(String s) {
     int[] dic =new int[265];
     Arrays.fill(dic,-1);
    int maxLen = 0;  
    int start = -1;
     for(int i = 0 ; i < s.length() ; i++){
        if(dic[s.charAt(i)]>start){
            start = dic[s.charAt(i)];
        }
       dic[s.charAt(i)] = i; 
       maxLen = Math.max(maxLen , i - start);
     }
     return maxLen;
    
    }
}