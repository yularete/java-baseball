package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetsPlayBall {

    public List<Integer> userNumber() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.println("숫자를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        List<Integer> userNum = new ArrayList<>();
        String input = sc.next();

        for (String number : input.split(""))
            userNum.add(Integer.parseInt(number));
        if(input.length() != 3) throw new IllegalArgumentException("입력값이 잘못되었습니다.");
        return userNum;
    }
}
