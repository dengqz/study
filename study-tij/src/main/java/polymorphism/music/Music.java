package polymorphism.music;

/**
 * @author : Cheese
 * @date : 2018/3/30
 * @description : TODO
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
