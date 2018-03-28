package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
