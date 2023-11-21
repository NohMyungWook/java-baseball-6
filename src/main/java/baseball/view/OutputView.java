package baseball.view;

import baseball.model.BaseballResult;
import baseball.service.constant.MachineConstant;
import baseball.view.constant.ViewMessage;

public class OutputView {
    public void printStartMessage() {
        ViewMessage.START.printLine();
    }

    public void printFinishMessage() {
        ViewMessage.CORRECT_ANSWER.printLine();
    }

    public void printResult(BaseballResult baseballResult) {
        if (baseballResult.strike() + baseballResult.ball() == 0) {
            ViewMessage.NOTHING.printLine();
            return;
        }
        printBallAndStrike(baseballResult);
    }

    private void printBallAndStrike(BaseballResult baseballResult) {
        if (baseballResult.strike() == 0) {
            ViewMessage.BALL.renderCountPrint(baseballResult.ball());
            return;
        }
        if (baseballResult.ball() == 0) {
            ViewMessage.STRIKE.renderCountPrint(baseballResult.strike());
            return;
        }
        ViewMessage.BALL_AND_STRIKE.renderCountPrint(baseballResult.ball(), baseballResult.strike());
    }
}
