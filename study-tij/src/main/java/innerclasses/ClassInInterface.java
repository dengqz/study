package innerclasses;

/**
 * @author : Cheese
 * @date : 2018/4/6
 * @description : TODO
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        @Override
        public void howdy(){
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
