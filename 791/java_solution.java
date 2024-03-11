class Solution791 {
    public String customSortString(String order, String s) {
        String result = "";

        char[] orderArray = order.toCharArray();
        char[] sArray = s.toCharArray();

        for(int i = 0; i < orderArray.length; i++) {
            for(int j = 0; j < sArray.length; j++) {
                if(orderArray[i] == sArray[j]) {
                    result += orderArray[i];
                    sArray[j] = '0';
                }
            }
        }

        for(int i = 0; i < sArray.length; i++) {
            if(sArray[i] != '0') result += sArray[i];
        }


        return result;
    }
}