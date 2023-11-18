package baseball.view.constant;

public enum ErrorMessage {
    NOT_A_NUMBER("숫자가 아닙니다."),
    INVALID_INPUT("올바른 입력값이 아닙니다.")
    ;

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
