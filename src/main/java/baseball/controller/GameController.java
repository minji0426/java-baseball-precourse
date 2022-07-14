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
        List<Integer> playerNumber = PlayerService.generatePlayerNumber(number); //플레이어 수

        System.out.println(computerNumber + ", " + playerNumber); //랜덤수. 플레이어 수 출력
        provideHint(ComputerService.generateComputerNumber(), playerNumber); // 힌트 출력
    }

    public static void provideHint(List<Integer> computerNumber,List<Integer> playerNumber) {
        Hint hint = HintService.generateHint(computerNumber, playerNumber);
        List<Integer> totalHint = HintService.getHint(hint);

        int ball = totalHint.get(0);
        int strike = totalHint.get(1);

        System.out.println( ball + "볼 " + strike + "스트라이크");
    }


}
