package initialization;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        petalCount = petals;
        print("Constructor w/ int arg only,petalCount= "
        + petalCount);
    }
    Flower(String ss){
        print("Constructor w/ Strinf arg only,s = " + ss);
        s=ss;
    }
    Flower(String s, int petals){
        this(petals);
        this.s = s;
        print("String & int args");
    }
    Flower(){
        this("hi",47);
        print("default constructor (no args)");
    }
    void printPetalCount(){
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
