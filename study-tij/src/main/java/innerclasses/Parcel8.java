package innerclasses;

/**
 * @author : Cheese
 * @date : 2018/4/6
 * @description : TODO
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override
            public int value(){
                return super.value()*47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
