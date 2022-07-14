package baseball.service;

import utils.RandomNum;

import java.util.ArrayList;
import java.util.List;

public class ComputerService {
    private static List<Integer> computerNumber = new ArrayList<>();

    public static List<Integer> generateComputerNumber() {
        computerNumber = RandomNum.generateRandomNum();
        return computerNumber;
    }
}
