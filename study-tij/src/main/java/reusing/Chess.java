package reusing;

import static net.mindview.util.Print.print;

/**
 * @author : Cheese
 * @date : 2018/3/29
 * @description : TODO
 */
class Game{
    Game(int i){
        print("Game constructor");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        print("BoardGame constructor");
    }
}
public class Chess extends BoardGame{
    Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
