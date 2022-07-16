package baseball.controller;

import baseball.domain.Hint;
import baseball.service.ComputerService;
import baseball.service.HintService;
import baseball.service.PlayerService;
import baseball.view.InputView;

import java.util.List;
import java.util.Scanner;

public class GameController {
    public static void playBaseballGame() {
        startGame();
    }

    public static void startGame() {
        List<Integer> computerNumber = ComputerService.generateComputerNumber(); //랜덤 수 생성

        String number = InputView.scanNumber();
        List<Integer> playerNumber = PlayerService.generatePlayerNumber(number); //플레이어 숫자

        System.out.println(computerNumber + ", " + playerNumber); //랜덤수. 플레이어 수 출력
        getHint(computerNumber, playerNumber); // 힌트 출력
    }

    public static void getHint(List<Integer> computerNumber,List<Integer> playerNumber) {
        Hint hint = HintService.generateHint(computerNumber, playerNumber);

        System.out.println( hint.getBall() + "볼 " + hint.getStrike() + "스트라이크");
    }


}
