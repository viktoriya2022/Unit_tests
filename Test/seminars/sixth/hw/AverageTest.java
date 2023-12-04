package seminars.sixth.hw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sixth.hw.Lists;

import static org.mockito.Mockito.*;

public class AverageTest {
    int[] array;
    double averageArray;
    double averageArray1;
    Lists listsMock;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5};
        averageArray = 3.0;
        averageArray1 = 2.0;
        listsMock = mock(Lists.class);
    }

    @Test
    void averageArray() {
        when(listsMock.averageArray(array)).thenReturn(averageArray);
    }

    @Test
    void compareArray() {
        listsMock.compareArrays(averageArray, averageArray1);
        verify(listsMock, times(1)).compareArrays(averageArray, averageArray1);
    }

    @Test
    void createArray() {
        when(listsMock.createArray()).thenReturn(array);
    }
}
