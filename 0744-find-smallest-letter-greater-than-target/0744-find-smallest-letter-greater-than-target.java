class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t = target - 0;
        for(int i =0 ; i<letters.length; i++){
            int a = letters[i] - 0;
            if(a > t)   return letters[i];
        }
        return letters[0];
    }
}