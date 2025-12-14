package Array;

public class Array {
    public static void main(String[] args) {
        // creating an array
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // printing arrays element with a method
        printArray(arr);

        // inserting element at a mid position
//        insertAtMid(arr,3,10);
//        printArray(arr);

        // removing element from the array
        // providing array and the index of element to remove from the array
        removeElement(arr,3);
        printArray(arr);

    }

    static void printArray(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertAtMid(int[] arr, int index, int value) {
        // first we have to shift the elements one time
        for(int i = arr.length - 2 ; i >= index ; i--){
            arr[i+1] = arr[i];

        }
        arr[index] = value;
    }

    static void removeElement(int[] arr, int index) {
        for(int i = index ; i <= arr.length-1 ; i++){
            if(i<arr.length-1) {
                arr[i] = arr[i + 1];
            }
            if(i == arr.length-1) {
                arr[i] = 0;
            }
        }
    }

    static void updateElement(int[] arr, int index, int value) {
        arr[index] = value;
    }

}
