package baseball.service;

import baseball.domain.Hint;

import java.util.ArrayList;
import java.util.List;

public class HintService {
    public static Hint generateHint(List<Integer> computerNumber, List<Integer> playerNumber) {
        Hint hint = new Hint(0,0);
        hint.isBall(computerNumber,playerNumber);
        hint.isStrike(computerNumber,playerNumber);

        return hint;
    }

    public static List<Integer> getHint(Hint hint) {
        List<Integer> finalHint = new ArrayList<>();

        finalHint.add(hint.getBall());
        finalHint.add(hint.getStrike());

        return finalHint;
    }

}
