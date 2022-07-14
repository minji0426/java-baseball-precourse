package baseball.view;

import java.util.Scanner;

public class InputView {
    public static String scanNumber(){
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        number = scanner.nextLine();

        return number;
    }


}
