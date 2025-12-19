package Array;

public class Bitonic {

    static int searchPeak(int[] arr){
        // using binary search to find it
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = first+(last-first)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }
    static int searchTarget(int[] arr,int target){
        int first = 0;
        int last = arr.length-1;

        // first finding peak
        int peek = searchPeak(arr);
        int n = peek;
        while(first<=peek){
            int mid = first+(peek-first)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                first = mid+1;
            }else if(arr[mid]>target){
                peek = mid-1;
            }
        }
        peek = n;
        while(last>=peek){
            int mid = peek+(last-peek)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                peek = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,4,3,2,1}; // mountain array
        // searching for peek element;
        System.out.println(arr[searchPeak(arr)]);
        System.out.println(searchTarget(arr,2));
    }
}
