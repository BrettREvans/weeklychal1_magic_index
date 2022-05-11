package classes;

public class MagicalIndex {


    public int magicIndexBruteTechnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i) {
                return i;
            }
        }
        return -1;
    }

    //recursive method using binary search pattern to find magic index within a sorted int array
    public int magicIndexBinarySearch(int[] arr, int start, int end) {
        if (start <= end) {
            int mid = (start + end) /2;
            if (mid == arr[mid]){
                return mid;
            }else if (mid > arr[mid]){
                //check right side
                return magicIndexBinarySearch(arr, mid + 1, end);
            }else {
                //check left side
                return magicIndexBinarySearch(arr, start, mid - 1);
            }
        }

        return -1;

    }
}
