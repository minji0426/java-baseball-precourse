package baseball.controller;

import baseball.service.PlayerService;
import baseball.view.InputView;

import java.util.List;
import java.util.Scanner;

public class GameController {
    public static void playBaseballGame() {
        startGame();
    }

    public static void startGame() {
        System.out.print(PlayerService.generatePlayerNumber(InputView.scanNumber()));
    }


}
