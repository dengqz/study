package initialization;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("length of a = " + a.length);
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(500);
        }
        print(Arrays.toString(a));
    }
}
