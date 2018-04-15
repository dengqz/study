package typeinfo;

/**
 * @author : Cheese
 * @date : 2018/4/15
 * @description : TODO
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
