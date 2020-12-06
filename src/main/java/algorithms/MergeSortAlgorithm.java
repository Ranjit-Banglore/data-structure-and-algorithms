package algorithms;

public class MergeSortAlgorithm {
    public void sort(int[] array) {
        divideAndMerge(array);
    }

    //create a new array with size (to-from).
    //index from inclusive and to exclusive.
    private int[] copyOfRange(int[] array, int from, int to) {
        int[] subArray = new int[to - from];
        int k = 0;
        while (from < to) {
            subArray[k] = array[from];
            k++;
            from++;
        }
        return subArray;
    }

    private void divideAndMerge(int[] array) {
        //return when array contain one element;
        if (array.length <= 1) {
            return;
        }
        int[] left = copyOfRange(array, 0, array.length / 2);
        int[] right = copyOfRange(array, array.length / 2, array.length);
        //Recursive calls until it breaks to
        divideAndMerge(left);
        divideAndMerge(right);
        merge(array, left, right);
    }

    private void merge(int[] array, int[] left, int[] right) {
        int left_idx = 0;
        int right_idx = 0;
        int k = 0;
        while (left_idx < left.length && right_idx < right.length) {
            if (left[left_idx] < right[right_idx]) {
                array[k] = left[left_idx];
                left_idx = left_idx + 1;
                k = k + 1;
            } else {
                array[k] = right[right_idx];
                right_idx = right_idx + 1;
                k = k + 1;
            }
        }
        while (left_idx < left.length) {
            array[k] = left[left_idx];
            left_idx = left_idx + 1;
            k = k + 1;
        }
        while (right_idx < right.length) {
            array[k] = right[right_idx];
            right_idx = right_idx + 1;
            k = k + 1;
        }
    }
}
