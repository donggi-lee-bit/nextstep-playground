package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MachineTest {

    Machine m;

    @BeforeEach
    void setUp() {
        m = new Machine();
    }

    @Test
    void create_numbers() {
        int[] numbersRange = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Set<Integer> randomNumbers = m.createRandomNumbers();

        List<Integer> numbers = new ArrayList<>(randomNumbers);

        assertThat(numbersRange).contains(numbers.get(0));
    }

    @Test
    void random_numbers_are_different_numbers() {
        Set<Integer> randomNumbers = m.createRandomNumbers();

        List<Integer> numbers = new ArrayList<>(randomNumbers);
        int value = numbers.get(0);

        assertThat(value).isNotEqualTo(numbers.get(1));
    }
}
