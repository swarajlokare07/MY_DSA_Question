class Solution {
    public String reverseStr(String s, int k) {
       char[] arr = s.toCharArray();
        
     for (int i = 0; i < arr.length-1; i +=2*k){
      int left  = i;
      int rigth = Math.min(i+k-1,arr.length - 1);
            while(rigth>left){
         char temp = arr[left];
         arr[left] = arr[rigth];
         arr[rigth] = temp; 
         left++;
         rigth--;

        }
     }

 return new String(arr);
    }
}