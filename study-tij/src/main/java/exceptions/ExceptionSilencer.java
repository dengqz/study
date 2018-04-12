package exceptions;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }finally {
            return;
        }
    }
}
