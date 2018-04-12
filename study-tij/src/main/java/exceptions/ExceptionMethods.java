package exceptions;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/4/11
 * @description : TODO
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            throw new Exception("My Exception");
        }catch (Exception e){
            print("Caught Exception");
            print("getMessage():" + e.getMessage());
            print("getLocalizedMessage():" +
            e.getLocalizedMessage());
            print("toString():" + e);
            print("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
