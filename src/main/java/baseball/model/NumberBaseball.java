package baseball.model;

import baseball.util.Validator;

import java.util.List;

public class NumberBaseball {
    private final List<Integer> numbers;

    public NumberBaseball(List<Integer> numbers) {
        validateMakeNumberBaseball(numbers);
        this.numbers = numbers;
    }

    private void validateMakeNumberBaseball(List<Integer> numbers) {
        Validator.validateSize(numbers);
        Validator.validateNotEmpty(numbers);
        Validator.validateDuplication(numbers);
        Validator.validateNumber(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}