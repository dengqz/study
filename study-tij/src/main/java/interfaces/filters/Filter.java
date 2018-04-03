package interfaces.filters;

/**
 * @author : Cheese
 * @date : 2018/4/1
 * @description : TODO
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
