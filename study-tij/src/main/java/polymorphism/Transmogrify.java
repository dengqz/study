package polymorphism;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/3/31
 * @description : TODO
 */
class Actor{
    public void act(){}
}
class HappyActor extends Actor{
    @Override
    public void act(){
        print("HappyActor");
    }
}
class SadActor extends Actor{
    @Override
    public void act() {
        print("SadActor");
    }
}
class State{
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
public class Transmogrify {
    public static void main(String[] args) {
        State state = new State();
        state.performPlay();
        state.change();
        state.performPlay();
    }
}
