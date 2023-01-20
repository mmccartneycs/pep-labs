public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int last = arr[0];
        boolean sorted = true;

        for(int i = 1; i<arr.length;i++){
            if(arr[i]> last && sorted == true){
                last = arr[i];
                sorted = true;
            }
            else sorted = false;
        }
        return sorted;
    }
}
