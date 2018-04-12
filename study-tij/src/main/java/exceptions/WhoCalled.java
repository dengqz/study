package exceptions;

/**
 * @author : Cheese
 * @date : 2018/4/11
 * @description : TODO
 */
public class WhoCalled {
    static void f(){
        try{
            throw new Exception();
        }catch (Exception e){
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }
    static void g(){f();}
    static void h(){g();}

    public static void main(String[] args) {
        f();
        System.out.println("---------------");
        g();
        System.out.println("---------------");
        h();
    }
}
