package polymorphism.music3;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/3/31
 * @description : TODO
 */
class Instrument{
    void play(Note n){
        print("Instrument.play() " + n);

    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        print("Adjusting Instrument");
    }
}
class Wind extends Instrument{
    @Override
    void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        print("Adjusting Wind");
    }
}
class Percussion extends Instrument{
    @Override
    void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        print("Adjusting Percussion");
    }
}
class Stringed extends Instrument{
    @Override
    void play(Note n) {
        print("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        print("Adjusting Stringed");
    }
}
class Brass extends Wind{
    @Override
    void play(Note n) {
        print("Brass.play() " + n);
    }

    @Override
    void adjust() {
        print("Adjusting Brass");
    }
}
class Woodwind extends Wind{
    @Override
    void play(Note n) {
        print("WoodWond.play() " + n);
    }

    @Override
    String what() {
        return "WoodWind";
    }
}
public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
