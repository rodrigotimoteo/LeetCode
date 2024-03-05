/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

abstract class GuessGame {
    int guess(int n) {
        return 0;
    }
}

class Solution374 extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n;
        int mid = 1;
        int result = 0;
    
        while(low < high) {
            mid = low + (high - low) / 2;

            result = guess(mid);

            if(result == 0) return mid;
            else if(result == -1) high = mid;
            else low = mid + 1;
        }
            
        return low;
    }
}