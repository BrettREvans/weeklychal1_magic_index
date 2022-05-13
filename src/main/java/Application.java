import classes.MagicalIndex;
import classes.RecursiveMultiply;

import java.util.ArrayList;

public class Application {


    public static void main(String[] args) {

        MagicalIndex mi = new MagicalIndex();
        RecursiveMultiply rm = new RecursiveMultiply();


        ///-----Magic Index-----///
        int[] ar = { -1, 0, 1, 2, 4, 10 };
        int[] ar2 = { -1, 1, 1, 4, 4, 5, 10 };

        runMagicIndexBrute(mi, ar2);
        System.out.println("/n");
        runMagicIndexBinary(mi, ar2);
        System.out.println("/n");

        ///------power sets------///


        ///------Recursive Multiply------///
        System.out.println("4 * 4 = " + rm.recursiveMultiplyOne(0, 4, 4));
        System.out.println("/n");
    }

    ///-----Magic Index-----///
    // will be able to get a list of magic indices in an array that has more than one magic indices
    public static void runMagicIndexBrute(MagicalIndex mi, int[] ar) {
        ArrayList<Integer> intArray = mi.magicIndexListBruteTechnique(ar);
        if (intArray.get(0) != -1) {
            System.out.println("The magic indices are: " + intArray);
        }else {
            System.out.println("No Magic index found");
        }
    }

    // is faster at finding one magic index and generally the first one found
    public static void runMagicIndexBinary(MagicalIndex mi, int[] ar) {
        if (mi.magicIndexBinarySearch(ar, 0, ar.length - 1) != -1) {
            System.out.println("The magic index is " + mi.magicIndexBinarySearch(ar, 0, ar.length - 1) + " found with a recursive binary search");
        }else {
            System.out.println("No Magic index found");
        }
    }
}
