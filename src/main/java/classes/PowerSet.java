package classes;

import java.util.Set;
import java.util.SortedSet;

public class PowerSet {


    public void printPowerSet(int []set, int set_size) {
        double pow_set_size = Math.pow(2, set_size);
        int i, j;
        
        for(i = 0; i < pow_set_size; i++) {
            for (j = 0; j < set_size; j++) {
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + ",");
            }

            System.out.println();
        }
    }
}
