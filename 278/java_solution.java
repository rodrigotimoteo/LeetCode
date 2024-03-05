/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    abstract class VersionControl {
        boolean isBadVersion(int v) {
            return false;
        }
    }

    class Solution278 extends VersionControl {
        public int firstBadVersion(int n) {
            int low = 1, high = n;
            int mid = 1;
    
            while(low < high) {
                mid = low + (high - low) / 2;
    
                if(isBadVersion(mid)) high = mid;
                else low = mid + 1;
            }
            
            return low;
        }
    }