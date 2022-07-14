package baseball.service;

import utils.RandomNumUtil;

import java.util.ArrayList;
import java.util.List;

public class ComputerService {
    private static List<Integer> computerNumber = new ArrayList<>();

    public static List<Integer> generateComputerNumber() {
        computerNumber = RandomNumUtil.generateRandomNum();
        return computerNumber;
    }
}
