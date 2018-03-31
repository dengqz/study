package polymorphism.music;

/**
 * @author : Cheese
 * @date : 2018/3/30
 * @description : TODO
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
