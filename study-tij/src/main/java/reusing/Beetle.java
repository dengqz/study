package reusing;

import static net.mindview.util.Print.*;

/**
 * @author : Cheese
 * @date : 2018/3/30
 * @description : TODO
 */
class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s){
        print(s);
        return 47;
    }
}
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
