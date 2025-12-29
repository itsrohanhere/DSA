package Array;

public class JumpArray{

    // ternary search
    static int ternerySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid1 = start + (end - start)/3;
            int mid2 = end - (end - start)/3;

            if(target >= arr[mid1] && target <= arr[mid2]){
                if(arr[mid1] == target){
                    return mid1;
                }else if(arr[mid2] == target){
                    return mid2;
                }else{
                    end = mid2 - 1;
                    start = mid1 + 1;
                }
            }else if(target <= arr[mid1]){
                end = mid1 - 1;

            }else{
                start = mid2 + 1;
            }
        }
        return -1;

    }

    // time complexity is O(Root N)
    static int jumpSeach(int[] array , int target){
        int n = array.length;
        int start = 0;

        int end = (int) Math.sqrt(n);
        int block = end;
        // for jumping over the blocks
        while(end < n && array[end] <= target){
            start = end;
            end += block;
        }
        for(int i = start; i < end; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int index = ternerySearch(arr,19);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element founda at " + index);
        }
    }
}
