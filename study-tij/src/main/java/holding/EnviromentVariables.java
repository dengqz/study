package holding;

import java.util.Map;

/**
 * @author : Cheese
 * @date : 2018/4/9
 * @description : TODO
 */
public class EnviromentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
            entry.getValue());
        }
    }
}
