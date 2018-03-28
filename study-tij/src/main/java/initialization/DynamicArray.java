package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle","de","dum"});
        }
    }
class Other{
    public static void main(String[] args) {
        for(String s : args){
            System.out.print(s + " ");
        }
    }
}

