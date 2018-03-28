package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class OptionalTrailingArguments {
    static void f(int required,String... trailiing){
        System.out.print("required: " + required + " ");
        for(String s : trailiing){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,"one");
        f(2,"two","three");
        f(0);
    }

}
