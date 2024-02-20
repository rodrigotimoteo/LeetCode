class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int count = 0;

        for(String word : words) 
            count += giveCharacters(word, chars);
        
        return count;
    }

    private int giveCharacters(String word, String chars) {
        char[] wordChar = word.toCharArray();
        char[] charChars = chars.toCharArray();

        for(int i = 0; i < wordChar.length; i++) {
            for(int l = 0; l < charChars.length; l++) {
                if(wordChar[i] == charChars[l]) {
                    wordChar[i] = '.';
                    charChars[l] = '.';
                    break;
                }
            }
        }

        for(char wordC : wordChar)
            if(wordC != '.') return 0;

        return wordChar.length;
    }
}