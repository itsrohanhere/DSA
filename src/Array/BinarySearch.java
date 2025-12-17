package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {22,23,25,34,56,56,56,56,56,65,87,88,89,95};
//        int[] arr2 = {99,85,74,65,42,32,20,1};
//        binarySearch(arr,25);
//        binarySearchDesc(arr2,20);
//        firstOccuranceByBinarySearch(arr,56);
//        firstOccurance(arr,56);
//        lastOccurance(arr,56);
        binarySearchFloor(arr,55);

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

    static void firstOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int firstOccurance = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                // so now we have the mid on the target
                // we have to check only the left side of the array
                firstOccurance = mid;
                if(arr[firstOccurance-1] == target){
                    end = mid - 1;
                }else{
                    System.out.println("the first occurance of the "+target+" is at Index " + firstOccurance);
                    return;
                }
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
    }
    static void lastOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int lastOccurance = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                // so now we have the mid on the target
                // we have to check only the left side of the array
                lastOccurance = mid;
                if(arr[lastOccurance+1] == target){
                    start = mid + 1;
                }else{
                    System.out.println("the first occurance of the "+target+" is at Index " + lastOccurance);
                    return;
                }
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
    }

    static void binarySearchFloor(int[] arr, int target){
        int ans = -1;
        int ans2 =-1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = arr[mid];

                return;
            }else if(arr[mid] < target){
                start = mid + 1;
                ans = arr[mid];
            }else{
                end = mid - 1;
                ans2 = arr[mid];
            }
        }
        System.out.println("element found at index: " + ans+" "+ ans2);
//        if(result == -1){
//            System.out.println("element not found");
//        }else{
//            System.out.println("element found at index: " + result);
//        }
    }
}
