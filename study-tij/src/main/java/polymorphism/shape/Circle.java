package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/3/31
 * @description : TODO
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }
}
