package Array;

public class shipCapacityProblem {
    public static boolean capacityAvailable(int[] weights, int days,int maxCapacity){
        int currentDay = 1;
        int capacity = 0;
        for(int i = 0 ; i < weights.length ; i++){
            capacity += weights[i];
            if(capacity >= maxCapacity){
                capacity = weights[i];
                currentDay += 1;
            }


        }
        return currentDay <= days;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i < weights.length ; i++){
            if(weights[i] > max){
                max = weights[i];
            }
            sum += weights[i];
        }
        int start = max;
        int end = sum;
        int capacity = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(capacityAvailable(weights,days,mid)){
                end = mid - 1;
                capacity = mid;
            }else{
                start = mid+1;
            }
        }
        return capacity;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(arr,days));
    }
}
