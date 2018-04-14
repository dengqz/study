package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/4/14
 * @description : TODO
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if(args.length < 2){
            print("Usage:\njava TestRegularExpression " +
            "characterSequence regularExpression+");
            System.exit(0);
        }
        print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            print("Regular expression: \""  + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m =p.matcher(args[0]);
            while(m.find()){
                print("Match \"" +m.group() + "\" atposotions " +
                m.start() + "-" + (m.end() - 1));
            }

        }
    }
}
