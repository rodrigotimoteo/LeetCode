public class Solution {

    public int hammingWeight(int n) {
    
    int count = 0;
    
    for(int i = 0; i < 32; i++) 
        if((n & (0b1 << i)) == (0b1 << i)) count++;

    return count;
}
