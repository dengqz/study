package exceptions;

import java.io.FileInputStream;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
public class MainException {
    public static void main(String[] args) throws Exception{
        FileInputStream file =
                new FileInputStream("MainException.java");
        file.close();
    }
}
