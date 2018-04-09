package holding;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author : Cheese
 * @date : 2018/4/9
 * @description : TODO
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}
