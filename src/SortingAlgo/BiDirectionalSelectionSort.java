package SortingAlgo;

public class BiDirectionalSelectionSort {
    public static void biDirectionalSelectionSort(int[] arr){

        int x = 0;
        int y = arr.length-1;
        while(x<y){
            int i = x+1;
            int max =  arr[x],min = arr[x];
            int minIndex = x,maxIndex = x;

            while(i<y){
                if(arr[i]<min){
                    minIndex = i;
                    min = arr[i];
                }
                if(arr[i]>max){
                    max = arr[i];
                    maxIndex = i;
                }
                i++;
            }

            // swap
            int temp = min;
            min = arr[minIndex];
            arr[minIndex] = temp;

//            if(maxIndex == i){
//                temp = max;
//                max = arr[minIndex];
//                arr[minIndex] = temp;
//            }else{
                temp = max;
                max = arr[maxIndex];
                arr[maxIndex] = temp;
//            }

            x++;
            y--;

        }

        for(int k : arr){
            System.out.print(" "+k);
        }
    }
}
