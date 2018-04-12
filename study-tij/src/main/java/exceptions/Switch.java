package exceptions;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
public class Switch {
    private boolean state = false;
    public void on(){state = true;print(this);}
    public void off(){state = false;print(this);}
    @Override
    public String toString(){return state ? "on" : "off";}
}
