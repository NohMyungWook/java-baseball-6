package baseball.view;

import baseball.util.Parser;
import baseball.util.Validator;
import baseball.view.constant.ViewMessage;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final int REPLAY = 1;
    private static final String SEPARATOR = "";

    private static final Parser parser = new Parser();
    private static final Validator validator = new Validator();

    public List<Integer> readNumber() {
        ViewMessage.ASK_NUMBER.print();

        return Arrays.stream(Console.readLine().split(SEPARATOR))
                .mapToInt(parser::parseNumber)
                .boxed().toList();
    }

    public boolean wantToContinue() {
        ViewMessage.REPLAY.printLine();

        int replay = parser.parseNumber(Console.readLine());
        validator.validateContinueNumber(replay);

        return replay == REPLAY;
    }
}
