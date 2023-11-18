package baseball.view;

import baseball.util.Parser;
import baseball.view.constant.ViewMessage;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String SEPARATOR = "";

    private static final Parser parser = new Parser();

    public List<Integer> readNumber() {
        ViewMessage.ASK_NUMBER.print();

        return Arrays.stream(Console.readLine().split(SEPARATOR))
                .mapToInt(parser::parseNumber)
                .boxed().toList();
    }
}
