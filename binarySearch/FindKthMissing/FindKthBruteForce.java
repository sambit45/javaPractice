package binarySearch.FindKthMissing;

import java.util.ArrayList;

public class FindKthBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive integer is: " + result);
    }

    public static int findKthPositive(int[] arr, int k) {
//        ArrayList<Integer> res = new ArrayList<>();
//        int j=0;
//        for(int i=1;i<=arr[arr.length-1];i++){
//            if(i==arr[j])
//                j++;
//            else
//                res.add(i);
//        }
//
//        if(res.size()<k){
//            int temp = arr[arr.length-1];
//            while(res.size()!=k){
//                res.add(++temp);
//            }
//        }
//
//        return res.get(k-1);


        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k)
                k++;
        }
        return k;
    }
}
