package binarySearch.KokoEatingBananas;

import java.lang.Math;
class KokoEatingBananas {
    public static void main(String[] args) {
        // int[] arr = {3, 6, 7, 11};
        int[] arr = {30, 11, 23, 4, 20};
        // int h = 8;
        int h = 5;
        int result = minEatingSpeed(arr, h);
        System.out.println("Minimum eating speed: " + result);
    }
    static int requiredTime(int[] arr, int mid) {
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            time += Math.ceil((double) arr[i] / mid);
        }
        return time;
    }

    public static int bs(int[] arr, int h, int max) {
        int s = 1;
        int e = max;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (requiredTime(arr,mid)<=h) {
                e = mid-1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }


    public static int minEatingSpeed(int[] arr, int h) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int ans = bs(arr, h, max);
        return ans;
    }
}
