package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author : Cheese
 * @date : 2018/4/9
 * @description : TODO
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words =
                new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(
                new TextFile("SetOperations.java","\\W+")
        );
        System.out.println(words);
    }
}
