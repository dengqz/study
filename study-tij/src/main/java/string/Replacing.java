package string;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/4/14
 * @description : TODO
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        print(s.replaceFirst("f\\W+","located"));
        print(s.replaceAll("shrubbery|tree|herring","bababa"));
    }
}
