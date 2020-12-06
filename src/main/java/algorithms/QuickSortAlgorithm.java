package algorithms;

public class QuickSortAlgorithm {
    //2, 8, 1, 9, 7
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int partitionIdx = partition(array, start, end);
        quickSort(array, 0, partitionIdx - 1);//subarray will be excluding the pivot element
        quickSort(array, partitionIdx + 1, end);//subarray will be excluding the pivot element
    }

    //arrange elements left to pivot lesser than its value and right to pivot
    //greater than it's value;
    private int partition(int[] array, int start, int end) {
        int partitionIdx = start;
        int pivot = array[end];
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, partitionIdx);
                partitionIdx++;
            }
        }
        swap(array, end, partitionIdx);
        return partitionIdx;
    }

    //swap array element at position p1 and p2
    private void swap(int[] array, int p1, int p2) {
        if (p1 == p2) return;
        array[p1] = array[p1] + array[p2];
        array[p2] = array[p1] - array[p2];
        array[p1] = array[p1] - array[p2];
    }
}
