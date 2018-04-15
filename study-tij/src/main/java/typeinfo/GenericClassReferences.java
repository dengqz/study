package typeinfo;

/**
 * @author : Cheese
 * @date : 2018/4/15
 * @description : TODO
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
    }
}
