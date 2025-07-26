package binarySearch;

public class CapacityToShipPackages {

    static int requiredDays(int[] arr,int mid){
        int d=1,sum=0;

        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else{
                d++;
                sum = arr[i];
            }
        }
        return d;
    }

   static int shipWithinDays(int[] arr,int d){
        int n = arr.length;

        int s = Integer.MIN_VALUE;
        int e = 0;

        for(int i=0;i<n;i++){
            s = Math.max(s,arr[i]);
            e += arr[i];
        }

        while (s<=e){
            int mid = s + (e-s)/2;
            int req = requiredDays(arr,mid);
            if(req<=d)
                e = mid-1;
            else
                s = mid+1;
        }
        return s;
    }

     public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int d=5;
        int ans = shipWithinDays(arr,d);
        System.out.println("Minimum value required to ship with in " + d +" days is " + ans );
    }

}
