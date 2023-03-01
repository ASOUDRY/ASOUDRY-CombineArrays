
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int number = arr1.length + arr2.length;
        int[] fusion = new int[number];
        int v = 0;
        for (int i = 0; i < number; i++) {
            if (i < arr1.length) {
        fusion[i] = arr1[i];
            }
            else {
                 fusion[i] = arr2[v];
                 v = v + 1;
            }
        }    
    return fusion;
    }
}
