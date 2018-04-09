package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author : Cheese
 * @date : 2018/4/9
 * @description : TODO
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}
