package No852;

public class BinarySearch_852 {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] < A[mid + 1])
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }
}
