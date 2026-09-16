class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length() - 1;

        // Skip spaces at the end
        while (n >= 0 && s.charAt(n) == ' ') {
            n--;
        }

        // Count last word
        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        return count;
    }
}
