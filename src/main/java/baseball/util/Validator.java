package baseball.util;

import baseball.view.constant.ErrorMessage;

import java.util.List;

public class Validator {
    private final static int CORRECT_SIZE = 3;
    private final static int IMPOSSIBLE_NUMBER = 0;

    public static void validateSize(List<Integer> numbers) {
        if (numbers.size() != CORRECT_SIZE)
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_LENGTH.getErrorMessage());
    }

    public static void validateNotEmpty(List<Integer> numbers) {
        if (numbers.isEmpty())
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getErrorMessage());
    }

    public static void validateNumber(List<Integer> numbers) {
        if (numbers.contains(IMPOSSIBLE_NUMBER))
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getErrorMessage());
    }
}
