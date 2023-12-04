package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
import third.coverage.SomeService;

import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {

    private  SomeService someService;

    @BeforeEach
    void setUp() {someService = new SomeService();
    }

   // 3.1. Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz. Эта
    //    функция принимает на вход число и возвращает "Fizz", если число делится на 3, "Buzz",
    //    если число делится на 5, и "FizzBuzz", если число делится на 15. Если число не делится ни
    //    на 3, ни на 5, ни на 15, функция возвращает входное число в виде строки.

    @Test
    void testReturnFizz() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void testReturnBuzz() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }
    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnValue() {
        assertThat(someService.fizzBuzz(11)).isEqualTo("11");
    }


    // 3.2 Разработайте тесты для метода firstLast6, где на вход подается массив чисел, а метод
    //возвращает true, если первое или последнее число в массиве равно 6, иначе false.

    @Test
    void firstLast6(){
        assertThat(someService.firstLast6(new int[]{6,5,4,6})).isTrue();
    }
    @Test
    void firstLastNot6(){
        assertThat(someService.firstLast6(new int[]{1,5,4,6})).isFalse();
    }

    //3.3

    @ParameterizedTest
    @CsvSource({
            "2000.0, 50, 1000",
            "2000.0, 100, 0",
            "2000.0, 0, 2000"
    })
    void calculationDiscountPositiveCase(double amount, int discount, double finishAmount ) {

        assertThat(someService.calculatingDiscount(amount, discount))
                .isEqualTo(finishAmount);
    }

    @Test

    void insufficientCoverageTest(){
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
        assertThatThrownBy(() ->
                someService.calculatingDiscount(-2000.0, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной"); // Отрицательная сумма покупки
    }

    //3.4
    @Test
    void correctSumm() {
        assertThat(someService.luckySum(1, 2,5)).isEqualTo(8);
    }
    @Test
    void correctSummA() {
        assertThat(someService.luckySum(13, 2,3)).isEqualTo(5);
    }
    @Test
    void correctSummC() {
        assertThat(someService.luckySum(1, 1,13)).isEqualTo(2);
    }
}