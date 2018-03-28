package initialization;

/**
 * @author : Cheese
 * @date : 2018/3/28
 * @description : TODO
 */
class Book{
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    @Override
    protected  void finalize(){
        if(checkedOut){
            System.out.println("Error: checked out");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
