package baseball;

import java.util.Scanner;

public class Game {

    static final String Notice_intro = "숫자 야구 게임을 시작합니다.";
    static final String Notice_requireNum = "숫자를 입력해주세요 : ";
    static final String Notice_success = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    static final String Notice_newGame = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void gameStart() {
        int ComputerNum = Num_Generator.MakeComputerNum();
        System.out.println(Notice_intro);

        while (true) {
            System.out.println(Notice_requireNum);
            Scanner sc = new Scanner(System.in);
            int userNum= sc.nextInt();
            System.out.println(userNum);
        }
    }
}