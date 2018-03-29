package access;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
class Sundae{
    private Sundae(){

    }
    static Sundae makeASundae(){
        return new Sundae();
    }

}
public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.makeASundae();
    }
}
