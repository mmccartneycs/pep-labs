public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int max = 0;
        for(int ar : arr){
            if( ar > max | ar == arr[0]){
                max = ar;
            }
        }
        return max;
    }
}
