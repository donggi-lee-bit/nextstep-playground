package baseball;

import static org.assertj.core.api.Assertions.assertThat;

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

        int number = m.createRandomNumbers();

        assertThat(numbersRange).contains(number);
    }
}
