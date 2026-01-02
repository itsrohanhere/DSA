package SortingAlgo;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = arr[i]; // let minimum element
            int minIndex = i; // minimum index
            int j = i+1;
            while(j < arr.length){
                if(arr[j] < min){
                    minIndex = j;
                }
                j++;
            }

            // swapping the elements minimum
            int  temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;



        }
        for(int k : arr){
            System.out.print(" "+k);
        }
    }
}
