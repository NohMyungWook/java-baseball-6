package baseball.common;

import baseball.model.NumberBaseball;
import baseball.service.NumberMachine;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private static final NumberMachine numberMachine = new NumberMachine();
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();

    public void start() {
        NumberBaseball computer = initializeGameSetting();
        do {
            NumberBaseball user = new NumberBaseball(inputView.readNumber());
        } while (wantToContinue());
    }

    private NumberBaseball initializeGameSetting() {
        outputView.printStartMessage();
        return numberMachine.makeAnswer();
    }

    private boolean wantToContinue() {
        outputView.printFinishMessage();
        return inputView.wantToContinue();
    }

}
