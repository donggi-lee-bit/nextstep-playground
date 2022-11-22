package baseball;

import java.util.Random;

public class Machine {

    public int createRandomNumbers() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
}
