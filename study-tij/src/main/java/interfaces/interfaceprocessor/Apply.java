package interfaces.interfaceprocessor;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/4/1
 * @description : TODO
 */
public class Apply {
    public static void process(Processor p, Object s){
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
