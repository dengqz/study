package innerclasses;

/**
 * @author : Cheese
 * @date : 2018/4/6
 * @description : TODO
 */
public class TestBed {
    public void f(){
        System.out.println("f()");
    }
    public static class Tester{
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
