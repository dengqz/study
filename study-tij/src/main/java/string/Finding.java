package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @author : Cheese
 * @date : 2018/4/14
 * @description : TODO
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is full of the linnet's wings");
        while(m.find()){
            printnb(m.group() + " ");
        }
        print();
        int i = 0;
        while(m.find(i)){
            printnb(m.group()+" ");
            i++;
        }
    }
}
