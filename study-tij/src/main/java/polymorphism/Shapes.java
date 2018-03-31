package polymorphism;

import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

/**
 * @author : Cheese
 * @date : 2018/3/31
 * @description : TODO
 */
public class Shapes {
    private  static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i++){
            s[i] = gen.next();
        }
        for(Shape shp : s){
            shp.draw();
        }
    }
}
