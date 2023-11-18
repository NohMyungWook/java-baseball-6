package baseball.view.constant;

public enum ErrorMessage implements Message {
    NOT_A_NUMBER("숫자가 아닙니다."),
    INVALID_INPUT("올바른 입력값이 아닙니다."),
    INVALID_INPUT_LENGTH("3자리가 아닙니다.")
    ;

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void print() {
        System.out.print(errorMessage);
    }

    @Override
    public void printLine() {
        System.out.println();
    }
}
