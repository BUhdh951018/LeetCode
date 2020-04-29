package No852;

public class LinearSearch_852 {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        while (A[i] < A[i + 1])
            i++;
        return i;
    }
}
