class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        int n = words.length;

        for(String i : words){
            if(i.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}