package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomNumberGenerator {

    public List<Integer> randomNumberGenerator() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}