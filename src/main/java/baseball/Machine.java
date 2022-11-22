package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Machine {

    public Set<Integer> createRandomNumbers() {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() != 3) {
            numbers.add(random.nextInt(9) + 1);
        }
        return numbers;
    }
}
