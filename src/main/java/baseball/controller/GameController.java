package baseball.controller;

import baseball.service.ComputerService;
import baseball.service.PlayerService;
import baseball.view.InputView;

import java.util.List;
import java.util.Scanner;

public class GameController {
    public static void playBaseballGame() {
        startGame();
        System.out.println("정답: " + ComputerService.generateComputerNumber());
        System.out.println(InputView.askContinue());
    }

    public static void startGame() {
        String number = InputView.scanNumber();
        PlayerService.generatePlayerNumber(number);
    }


}
