package baseball;

import baseball.common.BaseballGame;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();
        game.start();
        Console.close();
    }
}