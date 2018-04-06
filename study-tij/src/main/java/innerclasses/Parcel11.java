package innerclasses;

/**
 * @author : Cheese
 * @date : 2018/4/6
 * @description : TODO
 */
public class Parcel11 {
    private static class ParcelContents implements  Contents{
        private int i = 11;
        @Override
        public int value(){
            return i;
        }
    }
    protected static class ParcelDestination
    implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel(){
            return label;
        }
        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public static void f(){}
            static int x =10;
        }
    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents s = contents();
        Destination d = destination("Tasmanis");
    }
}
