package control;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;
import static net.mindview.util.Range.range;

/**
 * @author : Cheese
 * @date : 2018/3/27
 * @description : TODO
 */
public class ForEachInt {
    public static void main(String[] args) {
        for(int i : range(10)){
            printnb(i + " ");
        }
        print();
        for(int i : range(5,10)){
            printnb(i + " ");
        }
        print();
        for(int i : range(5, 20, 3)){
            printnb(i + " ");
        }
        print();
    }
}
