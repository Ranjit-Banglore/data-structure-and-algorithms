package algorithms;

public class BubbleSortAlgorithm {
    public void sort(int[] array){
        /**
         * After 1st iteration highest number is moved to
         * the end of the array, therefore j(max) is array.length-i-2
         */
        for (int i = 0; i <= array.length-1; i++) {
            for (int j = 0; j <= array.length - i - 2; j++) {
                if (array[j] > array[j + 1]) {
                    swapValuesAtIndex(array, j, j + 1);
                }
            }
        }
    }

    private void swapValuesAtIndex(int[] array, int idx1, int idx2) {
        array[idx1] = array[idx1] + array[idx2];
        array[idx2] = array[idx1] - array[idx2];
        array[idx1] = array[idx1] - array[idx2];
    }
}
