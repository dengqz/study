package exceptions;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("From f()");
    }
    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
