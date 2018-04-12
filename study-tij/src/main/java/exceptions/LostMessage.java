package exceptions;

/**
 * @author : Cheese
 * @date : 2018/4/12
 * @description : TODO
 */
class VeryImportException extends Exception{
    @Override
    public String toString() {
        return "A very important exception!";
    }
}
class HoHumException extends Exception{
    @Override
    public String toString() {
        return "A trivial exception";
    }
}
public class LostMessage {
    void f() throws VeryImportException{
        throw new VeryImportException();
    }
    void dispose() throws HoHumException{
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try{
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }finally {
                lm.dispose();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
