package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class VarargType {
    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.print("int[]: " + new int[0].getClass());
    }
}
