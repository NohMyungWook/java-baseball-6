package baseball.service;

import baseball.model.NumberBaseball;
import baseball.service.constant.MachineConstant;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class NumberMachine {

    public NumberBaseball makeAnswer() {
        List<Integer> answer = new ArrayList<>();

        while (answer.size() < MachineConstant.MAX_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MachineConstant.MINIMUM_NUMBER, MachineConstant.MAXIMUM_NUMBER);
            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
            }
        }

        return new NumberBaseball(answer);
    }
}
