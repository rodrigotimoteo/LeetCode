class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	return getString(word1).equals(getString(word2));
    }

    private String getString(String[] array) {
	
	StringBuilder sb = new StringBuilder();

	for(String string : array)
	    sb.append(string);

	return sb.toString();
    }
}
