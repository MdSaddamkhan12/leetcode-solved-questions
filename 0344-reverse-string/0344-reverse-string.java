class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        char[] copyArray = new char[n];


        // copy the elements from the original array to copyArray from the end(reverse)
        for(int i = 0; i < n; i++){

            copyArray[i] = s[n - 1 - i];
        }

        // copy the reverse elements to the original array(s)

        for(int i = 0; i < n; i++){

            s[i] = copyArray[i];
        }


    }
}