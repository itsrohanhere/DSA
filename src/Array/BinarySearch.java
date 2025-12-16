package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {22,23,25,34,56,56,56,56,56,65,87,88,89,95};
//        int[] arr2 = {99,85,74,65,42,32,20,1};
//        binarySearch(arr,25);
//        binarySearchDesc(arr2,20);
        firstOccuranceByBinarySearch(arr,56);
    }
    static void binarySearch(int[] arr, int target){
        int result = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                System.out.println("element found at index: " + mid);
                return;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(result == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index: " + result);
        }
    }

    static void binarySearchDesc(int[] arr, int target){
        int result = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                System.out.println("element found at index: " + mid);
                return;
            }else if(arr[mid] > target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(result == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index: " + result);
        }
    }

    static void firstOccuranceByBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int firstOccurance = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                // here we check for the fisrt occureance

                firstOccurance = mid;
                while(arr[firstOccurance-1] == target){
                    firstOccurance--;
                }
                System.out.println("the first occurance of the "+target+" is at Index "+ firstOccurance);
                return;
            }else if(arr[mid] < target){
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
    }
}
