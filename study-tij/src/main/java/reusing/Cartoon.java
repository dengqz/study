package reusing;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/3/29
 * @description : TODO
 */
class Art{
    Art(){
        print("Art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing{
    public Cartoon(){
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
