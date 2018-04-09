package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author : Cheese
 * @date : 2018/4/9
 * @description : TODO
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.java","\\W+"));
        System.out.println(words);
    }
}
