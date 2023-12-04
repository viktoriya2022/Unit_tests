package seminars.five;

import five.number.MaxNumberModule;
import five.number.RandomNumberModule;
import five.order.OrderService;
import five.order.PaymentService;
import five.user.UserRepository;
import five.user.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //5.1.
    @Test
    void checkListNumbers() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        List<Integer> listNumbers = randomNumberModule.generateListNumbers();

        assertThat(listNumbers.size()).isEqualTo(10);
    }

    // проверка поиска максимального числа
    @Test
    void searchMax() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 15, 100, 56, 13));

        assertThat(maxNumberModule.maxNumberInList(list)).isEqualTo(100);
    }

    // проверка взаимодействия двух ксаллов
    @Test
    void randomNumberMaxTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        List<Integer> listNumbers = randomNumberModule.generateListNumbers();
        int max = maxNumberModule.maxNumberInList(listNumbers);

        assertThat(max).isEqualTo(Collections.max(listNumbers));
    }

//    //5.2.
//    @ParameterizedTest
//    @ValueSource(ints = {1, 100, -10})
//    void testUserIntegration(int id) {
//        UserRepository ur = new UserRepository();
//        UserService us = new UserService(ur);
//
//        String result = us.getUserName(id);
//
//        assertEquals("select username from users where id = " + id, result);
//    }

    //5.3.
    @Test
    void orderServiceTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("10", 120);

        assertTrue(result);
    }

}