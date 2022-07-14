package baseball.domain;

import java.util.List;

public class Hint {
    private int strike;
    private int ball;

    public Hint(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
    public void isBall(List<Integer> computerNumber, List<Integer> playerNumber) {
        for (Integer num : playerNumber) {
            if (computerNumber.contains(num)) {
                ball++;
            }
        }
    }

    public void isStrike(List<Integer> computerNumber, List<Integer> playerNumber) {
        for (int i = 0; i < 3; i++) {
            if (playerNumber.get(i).equals(computerNumber.get(i))) {
                strike++;
                ball--;
            }
        }
    }
}
