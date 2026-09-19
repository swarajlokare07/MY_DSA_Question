class Solution {

    public static boolean check(char ch){

        if(ch != 'a' &&
                   ch != 'e' &&
                   ch != 'i' &&
                   ch != 'o' &&
                   ch != 'u' &&
                   ch != 'A' &&
                   ch != 'E' &&
                   ch != 'I' &&
                   ch != 'O' &&
                   ch != 'U') {
return true ;
                   }
                   else {
                    return false;
                   }
    }
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            
            while (i < j && check(arr[i])) {
                i++;
            }

           
            while (i < j && check(arr[j])) {
                j--;
            }

            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }
}