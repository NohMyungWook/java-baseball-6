package baseball.common;

import baseball.model.NumberBaseball;
import baseball.service.NumberMachine;
import baseball.view.InputView;

public class BaseballGame {
    private static final NumberMachine numberMachine = new NumberMachine();
    private static final InputView inputView = new InputView();

    public void start() {
        NumberBaseball computer = initializeGameSetting();
        inputView.readNumber();
    }

    private NumberBaseball initializeGameSetting() {
        return numberMachine.makeAnswer();
    }
}
