package baseball.view.constant;

public enum ViewMessage implements Message {
    START("숫자 야구 게임을 시작합니다."),
    ASK_NUMBER("숫자를 입력해 주세요 : "),
    NOTHING("낫싱"),
    BALL("%d볼"),
    STRIKE("%d스트라이크"),
    CORRECT_ANSWER("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    REPLAY("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    ;
    
    private final String viewMessage;
    
    ViewMessage(String viewMessage) {
        this.viewMessage = viewMessage;
    }

    @Override
    public void print() {
        System.out.print(viewMessage);
        printLine();
    }

    @Override
    public void printLine() {
        System.out.println();
    }
}