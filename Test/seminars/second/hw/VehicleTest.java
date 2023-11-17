package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import second.hw.Car;
import second.hw.Motorcycle;
import second.hw.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
        car = new Car("Toyota", "Rav4", 2021);
        motorcycle = new Motorcycle("YAMAHA", "XVS650", 2018);
    }

    // 3.1 Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    // 3.2 Проверка того, что объект Car создается с 4-мя колесами.
    @Test
    void testCarHaveFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // 3.3 Проверка того, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void testMotorcycleHaveTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    // 3.4 Проверка того, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testCarSpeedTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // 3.5 Проверка того, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testMotorcycleSpeedTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // 3.6 Проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void testCarParcSpeed() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // 3.7 Проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void testMotorcycleParcSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}