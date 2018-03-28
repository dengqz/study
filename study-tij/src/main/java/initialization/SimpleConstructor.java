package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/27
 * @description : TODO
 */
class Rock{
    Rock(){
        System.out.print("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new Rock();
        }
    }
}
