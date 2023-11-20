package baseball.model;

import baseball.model.BaseballResult;
import baseball.model.NumberBaseball;
import baseball.service.constant.MachineConstant;

import java.util.Objects;
import java.util.stream.IntStream;

public class ResultMachine {
    private final NumberBaseball computer;
    private final NumberBaseball user;

    public ResultMachine(NumberBaseball computer, NumberBaseball user) {
        this.computer = computer;
        this.user = user;
    }

    public BaseballResult createBaseballResult() {
        int strike = (int) IntStream.range(MachineConstant.INITIALIZE_INDEX, MachineConstant.MAX_SIZE)
                .filter(this::isStrike)
                .count();
        int ball = (int) IntStream.range(MachineConstant.INITIALIZE_INDEX, MachineConstant.MAX_SIZE)
                .filter(index -> !isStrike(index) && isBall(index))
                .count();

        return new BaseballResult(ball, strike);
    }

    private boolean isStrike(int index) {
        return Objects.equals(this.computer.getNumbers().get(index), this.user.getNumbers().get(index));
    }

    private boolean isBall(int index) {
        return this.computer.getNumbers().contains(this.user.getNumbers().get(index));
    }

}
