package access;

import access.cookie2.Cookie;

/**
 * @author : Cheese
 * @date : 2018/3/29
 * @description : TODO
 */
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2(){
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp(){
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
