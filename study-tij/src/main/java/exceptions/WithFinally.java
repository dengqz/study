package exceptions;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try{
            sw.on();
            OnOffSwitch.f();
        }catch (OnOffException1 e){
            System.out.println("OnOffException1");
        }catch (OnOffException2 e){
            System.out.println("OnOffException2");
        }finally {
            sw.off();
        }
    }
}
