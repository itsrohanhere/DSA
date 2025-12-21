package Array;

public class RotatedSortedArray{

    public static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else{
                // finding the sorted half
                if(nums[low]<=nums[mid]){
                    // first half is sorted
                    // check if the target is in the range
                    if(nums[low]<=target && target<=nums[mid]){
                        high = mid-1;
                    }else{
                        low = mid+1;
                    }

                }else{
                    // second half is sorted
                    if(nums[mid]<=target && target<=nums[high]){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }
            }
        }
        return -1;
    }

    public static int minimum(int[] arr){
        int low = 0;
        int high = arr.length - 1;
//        int min = Integer.MAX_VALUE;
        int min = -10000;
        while(low<=high){
            int mid = low+(high-low)/2;
            min = Math.min(min, arr[mid]);
            if (arr[low] <= arr[mid]) {
                // is this sorted;
                min = Math.min(min, arr[low]);
                low = mid+1;
            }else{
                // not sorted
                min = Math.min(min,arr[mid+1]);
                high = mid-1;
            }

            // going to second half for searching low

        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,10,11,12,15,18,19,20,1,2,3,4,5,6};
//        System.out.println(arr[search(arr,5)]);
        System.out.println(minimum(arr));
    }
}
