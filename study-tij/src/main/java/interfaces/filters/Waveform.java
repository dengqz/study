package interfaces.filters;

/**
 * @author : Cheese
 * @date : 2018/4/1
 * @description : TODO
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString(){
        return "Waveform " + id;
    }
}
