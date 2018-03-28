package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class OverloadingVarargs3 {
    static void f(float i,Character... args){
        System.out.println("first");
    }
    static void f(char c, Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1,'a');
        f('a','b');
    }
}
