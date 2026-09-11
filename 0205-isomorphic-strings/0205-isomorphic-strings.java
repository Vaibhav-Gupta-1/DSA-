class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer> str1 = new HashMap<>();
        HashMap<Character,Integer> str2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!str1.containsKey(s.charAt(i))){
                str1.put(s.charAt(i),i);
            }
            if(!str2.containsKey(t.charAt(i))){
                str2.put(t.charAt(i),i);
            }
            if(!str1.get(s.charAt(i)).equals(str2.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}