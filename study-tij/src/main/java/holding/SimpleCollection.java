package holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author : Cheese
 * @date : 2018/4/8
 * @description : TODO
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
