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

    public static void main(String[] args) {
        int[] arr = {5,1,3};
        System.out.println(arr[search(arr,5)]);

    }
}
