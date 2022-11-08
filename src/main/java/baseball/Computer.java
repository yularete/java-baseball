package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private static List<Integer> createRandomNumber(){
        List<Integer> comNum = new ArrayList<>();
        while (comNum.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!comNum.contains(randomNumber)) {
                comNum.add(randomNumber);
            }
        }
        return comNum;
    }
}
