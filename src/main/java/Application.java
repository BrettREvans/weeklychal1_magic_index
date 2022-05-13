import classes.MagicalIndex;
import classes.PowerSet;
import classes.RecursiveMultiply;
import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Application {


    public static void main(String[] args) {

        MagicalIndex mi = new MagicalIndex();
        RecursiveMultiply rm = new RecursiveMultiply();


        ///-----Magic Index-----///
        System.out.println("MAGIC INDEX");
        int[] ar = { -1, 0, 1, 2, 4, 10 };
        int[] ar2 = { -1, 1, 1, 4, 4, 5, 10 };

        runMagicIndexBrute(mi, ar2);
        runMagicIndexBinary(mi, ar2);
        System.out.println("\n");

        ///------power sets------///
        System.out.println("POWER SETS");
        int []set = {1,3,4};
        PowerSet ps = new PowerSet();
        ps.printPowerSet(set,3);
        System.out.println("\n");




        ///------Recursive Multiply------///
        System.out.println("RECURSIVE MULTIPLY");
        System.out.println("4 * 4 = " + rm.recursiveMultiplyOne(0, 4, 4));

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
