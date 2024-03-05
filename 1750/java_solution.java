class Solution1750 {
    public int minimumLength(String s) {
        char[] sArray = s.toCharArray();
        
        int left = 0, right = sArray.length - 1;

        while(left < right) {
            if(sArray[left] != sArray[right]) break;

            char leftChar = sArray[left];
            while(left <= right && sArray[left] == leftChar) left++;
            while(left <= right && sArray[right] == leftChar) right--;
        }

        return right - left + 1;
    }
}