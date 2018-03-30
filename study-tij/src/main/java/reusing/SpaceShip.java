package reusing;

/**
 * @author : Cheese
 * @date : 2018/3/29
 * @description : TODO
 */
public class SpaceShip extends SpaceShipControls{
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
