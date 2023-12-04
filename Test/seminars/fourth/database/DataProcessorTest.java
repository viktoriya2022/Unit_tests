package seminars.fourth.database;


import fourth.database.DataProcessor;
import fourth.database.Database;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class DataProcessorTest {
    @Test
    void dataTest(){
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);
        when(database.query(anyString())).thenReturn(Arrays.asList("Data1", "Data2", "Data3"));

        List<String> result = dataProcessor.processData("data1");

        verify(database).query("data1");
        assertThat(result).hasSize(3);
    }

}