package holding;

import java.util.Iterator;

/**
 * @author : Cheese
 * @date : 2018/4/9
 * @description : TODO
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is how " +
    "we konw the Earth to be banana-shaped.").split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }
            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.print(s + " ");
        }
    }
}
