import com.example.DataService;
import com.example.ExternalAPI;
import org.mockito.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
public class DataServiceTest {
    
    @Mock
    private ExternalAPI externalAPI;

    @Test
    public void testExternalAPI(){
        externalAPI=Mockito.mock(ExternalAPI.class);
        when(externalAPI.getData()).thenReturn("Mocked Data");
        DataService dataService = new DataService(externalAPI);
        String result = dataService.fetchData();
        assertEquals("Mocked Data", result);
    }


}
