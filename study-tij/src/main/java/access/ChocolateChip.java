package access;

import access.dessert.Cookie;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class ChocolateChip extends Cookie{
    public ChocolateChip(){
        System.out.println("ChocolateChip constructor");
    }

    public void chomp(){
        //! bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
