package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import third.hw.MainHW;

import static org.assertj.core.api.Assertions.*;


public class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    @Test
    void oddNumberTest(){
        assertThat(mainHW.evenOddNumber(4)).isTrue();
    }

    @Test
    void notOddNumberTest(){
        assertThat(mainHW.evenOddNumber(3)).isFalse();
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
    // и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    @ParameterizedTest
    @CsvSource({"10", "120"})
    void numberNotInIntervalTest(int number){

        assertThat(mainHW.numberInInterval(number)).isFalse();
    }

    @ParameterizedTest
    @CsvSource({"50", "25"})
    void numberInIntervalTest(int number){

        assertThat(mainHW.numberInInterval(number)).isTrue();
    }
}
