package typeinfo;

/**
 * @author : Cheese
 * @date : 2018/4/15
 * @description : TODO
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}
