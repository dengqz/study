package innerclasses;

/**
 * @author : Cheese
 * @date : 2018/4/6
 * @description : TODO
 */
class WithInner{
    class Inner{}
}

public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
