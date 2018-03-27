package control;

import java.util.Random;

/**
 * @author : Cheese
 * @date : 2018/3/27
 * @description : TODO
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for(int i = 0; i < 10; i++){
            f[i] = rand.nextFloat();
        }
        for(float x : f){
            System.out.println(x);
        }
    }
}
