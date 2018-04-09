package holding;

import java.util.*;

/**
 * @author : Cheese
 * @date : 2018/4/9
 * @description : TODO
 */
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list1 =
                new ArrayList<Integer>(Arrays.asList(ia));
        System.out.println("Before shuffling: " + list1);
        Collections.shuffle(list1,rand);
        System.out.println("After shuffling: " + list1);
        System.out.println("array: " + Arrays.toString(ia));

        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("Before shuffing: " +  list2);
        Collections.shuffle(list2,rand);
        System.out.println("After shuffing: " + list2);
        System.out.println("array: " + Arrays.toString(ia));
    }
}
