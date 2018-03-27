package control;

import static net.mindview.util.Range.range;

/**
 * @author : Cheese
 * @date : 2018/3/27
 * @description : TODO
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if(i == 74){
                break;
            }
            if(i % 9 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : range(100)){
            if(i ==74){
                break;
            }
            if(i % 9 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        while(true){
            int j = i * 27;
            if(j == 1269){
                break;
            }
            if(i % 10 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
