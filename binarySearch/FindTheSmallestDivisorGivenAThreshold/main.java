// File: FindTheSmallestDivisorGivenAThreshold/main.java
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        int threshold = 5;
        Solution sol = new Solution();
        int result = sol.smallestDivisor(arr, threshold);
        System.out.println("The smallest divisor is: " + result);
    }
}

class Solution {

    int time(int[] arr, int h) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.ceil((double) arr[i] / h);
        }
        return ans;
    }

    int bs(int[] arr, int maxi, int th) {
        int s = 1, e = maxi;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (time(arr, mid) <= th)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return s;
    }

    public int smallestDivisor(int[] arr, int th) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            maxi = Math.max(maxi, arr[i]);

        return bs(arr, maxi, th);
    }
}
