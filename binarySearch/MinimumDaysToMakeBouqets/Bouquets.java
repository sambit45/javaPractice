package binarySearch.MinimumDaysToMakeBouqets;

public class Bouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 11, 12, 7};
        int m = 2; // Number of bouquets
        int k = 3;
        int result = minDays(bloomDay, m, k);
        System.out.println("The minimum days to make " + m + " bouquets is: " + result);
    }

    static int test(int[] arr, int k, int mid){
        int count=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                res += count/k;
                count = 0;
            }
            else
                count++;
        }
        if (count != 0)
            res += count/k;
        return res;
    }

    public static int minDays(int[] arr, int m, int k) {

        if( arr.length < (long) m * k)
            return -1;

        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        int s=min;
        int e=max;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(test(arr,k,mid)<m)
                s=mid+1;
            else
                e=mid-1;
        }
        return s;

    }
    
}
