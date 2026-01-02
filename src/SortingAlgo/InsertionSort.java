package SortingAlgo;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            int j = i+1;
            while(j > 0 && arr[j] < arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
                i--;
            }
        }
        for(int k : arr){
            System.out.print(" "+ k);
        }
    }
}
