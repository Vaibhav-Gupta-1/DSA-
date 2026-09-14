class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n = s.length();
        HashMap<String,Integer> mp = new HashMap<>();
        int maxOccurrences = 0;
        int left =0, right = minSize;
        while(right <= s.length()){
            String subStr = s.substring(left,right);
            mp.put(subStr,mp.getOrDefault(subStr,0)+1);
            left++;
            right++;
        }
        
        for(String str : mp.keySet()){
            int count = mp.get(str);
            if(count > maxOccurrences && isValidSubstring(str, maxLetters))
                maxOccurrences = count;
        }
        return maxOccurrences;
    }
    public boolean isValidSubstring(String substr, int maxLetters){
        HashSet<Character> counts = new HashSet<>();
        for(int i=0;i<substr.length();i++){
            char c = substr.charAt(i);
            counts.add(c);
        }
        return counts.size()<=maxLetters;
    }
}