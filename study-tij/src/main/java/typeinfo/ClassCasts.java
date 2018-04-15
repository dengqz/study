package typeinfo;

/**
 * @author : Cheese
 * @date : 2018/4/15
 * @description : TODO
 */
class Building{}
class House extends Building{}
public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b;
    }
}
