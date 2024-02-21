class Solution58 {
    public int lengthOfLastWord(String s) {
        int temp = 0;
        s = s.trim();
        s = s.substring(s.lastIndexOf(' ') + 1, s.length());
        for(int i = 0; i < s.length(); i++) {
            temp++;
        }
        return temp;
    }
}