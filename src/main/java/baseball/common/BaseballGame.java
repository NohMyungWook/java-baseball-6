package baseball.common;

import baseball.model.BaseballResult;
import baseball.model.NumberBaseball;
import baseball.service.NumberMachine;
import baseball.service.ResultMachine;
import baseball.service.constant.MachineConstant;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGame {
    private static final NumberMachine numberMachine = new NumberMachine();
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();

    public void start() {
        NumberBaseball computer = initializeGameSetting();
        do {
            playGame(computer);
        } while (wantToContinue());
    }

    private NumberBaseball initializeGameSetting() {
        outputView.printStartMessage();
        return numberMachine.makeAnswer();
    }

    private void playGame(NumberBaseball computer) {
        BaseballResult baseballResult;
        do {
            NumberBaseball user = new NumberBaseball(inputView.readNumber());
            ResultMachine resultMachine = new ResultMachine(computer, user);
            baseballResult = resultMachine.createBaseballResult();
        } while (baseballResult.strike() != MachineConstant.MAX_STRIKE);
    }

    private boolean wantToContinue() {
        outputView.printFinishMessage();
        return inputView.wantToContinue();
    }

}
