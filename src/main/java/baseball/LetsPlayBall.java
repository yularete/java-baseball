package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LetsPlayBall {

    public static void start(LetsPlayBall letsPlayBall) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        int ball = 0;
        int strike = 0;
        LinkedList<Integer> answer = LetsPlayBall.setComNum();
        while (strike < MAX_NUMBER) {
            LinkedList<Integer> userNumber = LetsPlayBall.userNum();
            strike = LetsPlayBall.strike(comNum, userNum);
            ball = LetsPlayBall.ball(comNum, userNum);
            LetsPlayBall.output(ball, strikeCount);
        }
    }

    public List<Integer> userNumber() {
        System.out.println("숫자를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        List<Integer> userNum = new ArrayList<>();
        String input = sc.next();

        for (String number : input.split(""))
            userNum.add(Integer.parseInt(number));
        if(input.length() != 3) throw new IllegalArgumentException("입력값이 잘못되었습니다.");
        return userNum;
    }
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

    public static int strikeCount(List<Integer> userNum, List<Integer> comNum){
        int strike = 0;
        for(int i=0; i<userNum.size(); i++){
            if(userNum.get(i).equals(comNum.get(i))) {
                strike++;
            }
        }
        return strike;
    }

    public static int ballCount(List<Integer> userNum, List<Integer> comNum){
        int ball = 0;
        for(int i=0; i<userNum.size(); i++){
            if(!userNum.get(i).equals(comNum.get(i)) && comNum.contains(userNum.get(i)))   {
                ball++;
            }
        }
        return ball;
    }

    public static Boolean nothingCount(List<Integer> userNum, List<Integer> comNum){
        boolean Nothing = true;
        for (Integer integer : userNum)
            if (comNum.contains(integer)) {
                Nothing = false;
                break;
            }
        return Nothing;
    }

    public int compare(List<Integer> userNum, List<Integer> comNum){
        int result = 0;
        for(int i = 0; i < userNum.size(); i++){
            if(comNum.contains(userNum.get(i))){
                result += 1;
            }
        }
        return result;
    }
}
