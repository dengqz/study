package exceptions;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
class ThreeException extends Exception{}
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while(true){
            try{
                if(count++ == 0){
                    throw new ThreeException();
                }
                System.out.println("NoException");
            }catch (ThreeException e){
                System.out.println("ThreeException");
            }finally {
                System.out.println("In finaly clause");
                if(count == 2){
                    break;
                }
            }
        }
    }
}
