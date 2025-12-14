package Array;

public class Array2D {
    public static void main(String[] args) {
//    creating a 2D array
        int[][] arr = new int[3][3];
//       Row =1
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
//       Row = 2
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
//       Row = 3
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;
//      Printing 2D array
//        print2dArray(arr);
//      Inserting elements in the array
//      let make 50 to 100
//        insert2dArray(arr,1,1,100);
//        print2dArray(arr);

//      now removing elements from the arrays
//        remove2dArray(arr,1,1);
//        print2dArray(arr);

//        this is for updating the element in array
        update2dArray(arr , 1,1,100);
        print2dArray(arr);
    }

    static void print2dArray(int[][] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            Array.printArray(arr[i]);
        }

    }

    static void insert2dArray(int[][] arr, int pos1, int pos2, int value){
        Array.insertAtMid(arr[pos1] , pos2, value);
    }

    static void remove2dArray(int[][] arr, int pos1, int pos2){
        Array.removeElement(arr[pos1], pos2);
    }

    static void update2dArray(int[][] arr, int pos1, int pos2, int value){
        Array.updateElement(arr[pos1], pos2, value);
    }
}
