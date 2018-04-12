package exceptions;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}
public class Human {
    public static void main(String[] args) {
        try{
            throw new Sneeze();
        }catch (Sneeze s){
            System.out.println("Caught Sneeze");
        }catch (Annoyance a){
            System.out.println("Caught Annoyance");
        }
        try{
            throw new Sneeze();
        }catch (Annoyance a){
            System.out.println("Caught Annonance");
        }
    }
}
