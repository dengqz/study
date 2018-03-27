package control;

/**
 * @author : Cheese
 * @date : 2018/3/27
 * @description : TODO
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5 ;i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
