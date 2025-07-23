package binarySearch.FindKthMissing;


//T.C - O(log n) S.C - O(1)

public class FindKthOptimalUsingBS {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 6;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive integer is: " + result);
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int s=0,e=n-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int missing = arr[mid]-(mid+1);
            if(missing < k ){
                s = mid+1;
            }
            else
                e = mid-1;
        }
        return s + k;

    }
}
