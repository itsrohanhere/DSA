package Array;

public class LinearSearch {
    static void search(int[] arr, int target,boolean last_index) {
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                ans = i;
                if(last_index == false){
                    break;
                }
            }
        }
        System.out.println("target found at index " + ans);
    }

    static void searchMultiple(int[] arr,int target){
        int ans[] = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                ans[index] = i;
                index++;
            }
        }
        if (index == 0) {
            System.out.println(" target not found");
        }else{
            for(int i = 0; i < index; i++){
                System.out.println("target fount at "+ans[i]);
            }
        }
    }
}
