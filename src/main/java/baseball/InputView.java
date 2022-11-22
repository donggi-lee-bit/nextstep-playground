package baseball;

import java.util.Scanner;

public class InputView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("숫자를 입력해 주세요 : ");
        String[] input = sc.nextLine().split("");
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
    }
}
