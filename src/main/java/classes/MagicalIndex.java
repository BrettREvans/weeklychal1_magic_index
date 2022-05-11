package classes;

public class MagicalIndex {

    //brute force method to find magic index within a sorted int array
    public int magicIndexBruteTechnique(int[] array) {
        //compare every value in the array against its own position only stoping when a magic index is found
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i) {
                return i;
            }
        }
        return -1;
    }

    //recursive method using binary search pattern to find magic index within a sorted int array
    public int magicIndexBinarySearch(int[] arr, int start, int end) {
        //array need to be sorted to work
        //  if start is less or equal to end we can search for a magic index still
        //  otherwise the array has no magic index and returns -1
        if (start <= end) {
            //save the mid point of the array
            // if that midpoint is equal to the value given
            //                                             we found or magic index
            // else if mid is greater than the value given
            //                                             we should check the right side
            // else the mid is less than the value given
            //                                             we should check the left side

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
