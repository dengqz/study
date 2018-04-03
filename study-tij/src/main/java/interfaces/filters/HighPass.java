package interfaces.filters;

/**
 * @author : Cheese
 * @date : 2018/4/1
 * @description : TODO
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    @Override
    public Waveform process(Waveform input){
        return input;
    }
}
