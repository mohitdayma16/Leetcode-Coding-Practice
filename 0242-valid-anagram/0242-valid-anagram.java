class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toLowerCase().toCharArray();
        char[] b = t.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }
        else{
            return false;
        }
    }
}