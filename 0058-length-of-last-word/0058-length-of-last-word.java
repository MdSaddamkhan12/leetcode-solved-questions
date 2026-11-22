class Solution {
    public int lengthOfLastWord(String s) {

        // trim() removes leading/trailing spaces and the split collapses internal runs, so no empty strings appear
        String[] words = s.trim().split("\\s+");

        int lastWordInx = words.length - 1;

        String lastWord = words[lastWordInx];

        // return words[words.length - 1].length();
        return lastWord.length();
        
    }
}