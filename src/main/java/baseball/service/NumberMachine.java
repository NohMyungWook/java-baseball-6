package baseball.service;

import baseball.model.NumberBaseball;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class NumberMachine {
    private static final int MAX_SIZE = 3;
    private static final int MINIMUM_NUMBER = 1;
    private static final int MAXIMUM_NUMBER = 9;

    public NumberBaseball makeAnswer() {
        List<Integer> answer = new ArrayList<>();

        while (answer.size() < MAX_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MINIMUM_NUMBER, MAXIMUM_NUMBER);
            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
            }
        }

        return new NumberBaseball(answer);
    }
}
