package Array;

public class kokoBanana {
    public static boolean isValid(int[] arr , int mid ,int h){

        int currentHour = 0;
        for(int i = 0; i < arr.length ; i++){

                currentHour += Math.ceil(arr[i]/mid);
                if(arr[i]%mid != 0){
                    currentHour += 1;
                }


        }
        return currentHour <= h;

    }
    public static int minEatingSpeed(int[] piles, int h) {
        // first finding max and second finding answer from 1 to max
        int max = 0;
        for(int i = 0; i < piles.length ; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        if(piles.length == h){
            return max;
        }
        int low = 1;
        int high = max;

        int ans = 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid(piles,mid,h)){
                high = mid - 1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
