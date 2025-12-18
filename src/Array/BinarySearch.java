package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {22,23,25,34,56,56,56,56,56,65,87,88,89,95,101,110,125,132,35,139,142,145,148,152,153,154,159,160,162,166,169,170,177,178,180,185,190,195,199,201,202,204,205,206,209,215,219,220,225,250,255,260};
//        int[] arr2 = {99,85,74,65,42,32,20,1};
//        binarySearch(arr,25);
//        binarySearchDesc(arr2,20);
//        firstOccuranceByBinarySearch(arr,56);
//        firstOccurance(arr,56);
//        lastOccurance(arr,56);
//        binarySearchFloor(arr,55);

//        binarySearchMAD(arr,100);
        infiniteArray(arr,166);
    }
    static void binarywithparam(int[] arr, int start,int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println("fount at index "+mid+"->"+arr[mid]);
                return;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    }
    static void infiniteArray(int[] arr, int target){
        // considering the array is infinite
        // there will be no end
        int start  = 0;
        int end = 1;
        // first we find end and set the start
        int i = 0;
        while(arr[end]<target){
            start = end;
            if(arr[end] < target){
                end = (int)Math.pow(2,++i);
            }

        }

        System.out.println(start+"<- "+arr[start]+"    "+arr[end]+" ->"+end);
        binarywithparam(arr,start,end,target);
    }

    static void binarySearchMAD(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                result = Math.abs(target-arr[mid]);
                System.out.println(result);
                return;
            }else if(arr[mid]>target){
                end = mid-1;

            }else{
                start = mid+1;
            }
        }
        if(end == -1){
            result = Math.abs(target-arr[start]);
            System.out.println(result+" int end = -1 ");
            return;
        }else if(start == arr.length){
            result = Math.abs(target-arr[end]);
            System.out.println(result+" int start = N ");
            return;
        }else{
            int a = Math.abs(target-arr[start]);
            int b = Math.abs(target-arr[end]);
            System.out.println((a<b)?a:b);
            return;
        }
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
