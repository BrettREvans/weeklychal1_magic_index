package classes;

public class RecursiveMultiply {

    //a * b
    //2 * 3 = 2 + 2 + 2
    public int recursiveMultiplyOne(int value, int a, int b) {
        if (b != 0) {
            // add a to value, send in a, subtract from iterations needed
            return recursiveMultiplyOne(value + a, a, b - 1);
        }

        return value;
    }

}
