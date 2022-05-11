import classes.MagicalIndex;

public class Application {


    public static void main(String[] args) {

        MagicalIndex mi = new MagicalIndex();



        int[] ar = { -1, 0, 1, 2, 4, 10 };



        testMagicIndexBrute(mi, ar);
        System.out.println("/n");
        testMagicIndexBinary(mi, ar);

    }

    public static void testMagicIndexBrute(MagicalIndex mi, int[] ar) {
        if (mi.magicIndexBruteTechnique(ar) != -1) {
            System.out.println("The magic index is: " + mi.magicIndexBruteTechnique(ar));
        }else {
            System.out.println("No Magic index found");
        }
    }
    public static void testMagicIndexBinary(MagicalIndex mi, int[] ar) {
        if (mi.magicIndexBinarySearch(ar, 0, ar.length - 1) != -1) {
            System.out.println("The magic index is " + mi.magicIndexBinarySearch(ar, 0, ar.length - 1) + " found with a recursive binary search");
        }else {
            System.out.println("No Magic index found");
        }
    }



}
