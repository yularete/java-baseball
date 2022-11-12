package baseball;

import baseball.domain.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        boolean repeat = true;
//
//        while (repeat){
//            List<Integer> computer = LetsPlayBall.createRandomNumber();
//            String result = "";
//            while (!result.equals("3스트라이크")){
//                result = LetsPlayBall.gameResult(computer, LetsPlayBall.getSetGo());
//                System.out.println(result);
//            }
//            repeat = LetsPlayBall.restart();

//add라는 기능을 쓰고싶으면 calculate를 꺼내와야함
//    new Calculator(); //사용할 수 있음! 이 순간부터... 임포트도 해야함.
/*           Calculator calculator;  <- 선언
            calculator = new Calculator(); <-  할당.*/
Calculator calculator = new Calculator(); // 이부터 }까지 맘껏쓸쑤있어. 클래스를 만든게 아니고 복사인것이니 인스턴스가 된거임.
//        System.out.println(calculator.add(1,3));
        System.out.println(calculator.add(1,2));
//        System.out.println(calculator.result);
        System.out.println(Calculator.shareResult);


        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.add(4,5));
        System.out.println(Calculator.shareResult);

        System.out.println(Calculator.SHARE_BIRTHDAY);

        //calculator0과 1은 같은 result 값을 공유하는 건 아님 !
    }
}
