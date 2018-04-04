package interfaces.filters;

/**
 * @author : Cheese
 * @date : 2018/4/1
 * @description : TODO
 */
public class BandPass extends  Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    @Override
    public Waveform process(Waveform input){
        return input;
    }
}
