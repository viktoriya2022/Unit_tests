package seminars.fourth.hotel;


import fourth.hotel.BookingService;
import fourth.hotel.HotelService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    private BookingService bookingService;
    private HotelService hotelService;


    @BeforeEach
    void setUp(){
        hotelService = mock(HotelService.class);
        bookingService= new BookingService(hotelService);
    }

    @Test
    void checkNumberTrue() {
        when(hotelService.isRoomAvailable(24)).thenReturn(true);

        boolean result = bookingService.bookRoom(24);

        assertTrue(result);
    }

    @Test
    void checkNumberFalse() {
        when(hotelService.isRoomAvailable(23)).thenReturn(false);

        boolean result = bookingService.bookRoom(23);

        assertFalse(result);
    }
}
