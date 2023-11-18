package baseball.view;

import baseball.util.Parser;
import baseball.view.constant.ViewMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final Parser parser = new Parser();
    public int readNumber() {
        ViewMessage.ASK_NUMBER.print();
        return parser.parseNumber(Console.readLine());
    }
}
