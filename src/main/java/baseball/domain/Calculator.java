package baseball.domain;

public class Calculator {
    // 칼큘레이터라는 클래스 내부에서 존재하는 변수 = 인스턴스 변수 = 복사본
    public int result = 0; //외부에서 접근할 수 있는 변수.

    public static final int SHARE_BIRTHDAY = 1104; //클래스 변수이지만 값이 불변하기에 상수라고한다.

    //dynamic의 반대말.
    public static int shareResult = 0; // static이 붙은 건 클래스 변수

    public Calculator() {
    }
//     add는 숫자2개를 받아서 숫자를 반환할거야. = return이 필요.
//                      int dataType만 받을거라고 명시
    public int add(int number1, int number2) {
        result =number1+number2;
        shareResult = result;
        return result;
    }
}
