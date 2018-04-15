package typeinfo.toys;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/4/14
 * @description : TODO
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy{
    Toy(){}
    Toy(int i){}
}
class FancyToy extends Toy
implements HasBatteries,Waterproof,Shoots{
    FancyToy(){
        super(1);
    }
}
public class ToyTest {
    static void printInfo(Class cc){
        print("Class name: " + cc.getName() +
        " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("typeinfo.toys.FancyToy");
        }catch (ClassNotFoundException e){
            print("Can't find FancyToy");
            System.exit(0);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        }catch (InstantiationException e){
            print("Cannot instantiate");
            System.exit(0);
        }catch (IllegalAccessException e){
            print("Cannot access");
            System.exit(0);
        }
        printInfo(obj.getClass());
    }
}
