package polymorphism;

/**
 * @author : Cheese
 * @date : 2018/3/31
 * @description : TODO
 */
class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}
class StaicSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaicSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
