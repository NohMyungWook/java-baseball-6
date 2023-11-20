package baseball.view;

import baseball.view.constant.ViewMessage;

public class OutputView {
    public void printStartMessage() {
        ViewMessage.START.printLine();
    }

    public void printFinishMessage() {
        ViewMessage.CORRECT_ANSWER.printLine();
    }
}
