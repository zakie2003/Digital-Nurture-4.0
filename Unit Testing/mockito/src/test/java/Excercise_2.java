import com.example.DataService;
import com.example.ExternalAPI;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



public class Excercise_2 {
    @Test
    public void testVerifyInteraction() {
    ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);
    DataService service = new DataService(mockApi);
    service.fetchData();
    verify(mockApi).getData();
 }
} 
