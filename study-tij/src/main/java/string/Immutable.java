package string;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/4/13
 * @description : TODO
 */
public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q);
        String qq = upcase(q);
        print(qq);
        print(q);
    }
}
