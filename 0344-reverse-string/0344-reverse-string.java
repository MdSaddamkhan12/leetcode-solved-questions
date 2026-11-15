class Solution {
    public void reverseString(char[] s) {

        reverse(s, 0, s.length - 1);
        
    }

    private void reverse(char[] s, int left, int right){

        // Base case
        if(left >= right){

            return;
        }

        // Swap and recurse on the inner subarray
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverse(s, left + 1, right - 1);
    }
}