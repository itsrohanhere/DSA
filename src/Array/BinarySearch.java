package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {22,23,25,34,56,65,87,88,89,95};
        binarySearch(arr,25);
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
}
