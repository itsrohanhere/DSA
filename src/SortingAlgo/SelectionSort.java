package SortingAlgo;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int minIndex = i;
            int min = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }


            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            i++;
        }
        for(int k : arr){
            System.out.print(" "+k);
        }
    }
}
