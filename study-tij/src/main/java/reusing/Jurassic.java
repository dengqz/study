package reusing;

/**
 * @author : Cheese
 * @date : 2018/3/30
 * @description : TODO
 */
class SmallBrain{}
final class Dinosaur{
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){}
}
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}