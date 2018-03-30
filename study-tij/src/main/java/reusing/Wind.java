package reusing;

/**
 * @author : Cheese
 * @date : 2018/3/30
 * @description : TODO
 */
class Instrument{
    public void play(){
    }
    static void tune(Instrument i){
        i.play();
    }
}

public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
