package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class OverloadingVarargs2 {
    static void f(float i,Character... args){
        System.out.println("first");
    }
    static void f(Character... args){
        System.out.print("second");
    }

    public static void main(String[] args) {
        f(1,'a');
        //f('a','b');
    }
}
