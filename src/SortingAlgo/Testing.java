package SortingAlgo;

public class Testing {

    public static void main(String[] args) {
        // array for checking
        int[] arr = {5,4,8,2,1,6,7,9};
//        InsertionSort.insertionSort(arr);
//        SelectionSort.selectionSort(arr);
        BiDirectionalSelectionSort.biDirectionalSelectionSort(arr);
    }
}
