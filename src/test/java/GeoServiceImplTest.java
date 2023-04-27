import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoServiceImplTest {

    @Test
    public void test_byIp(){
        GeoServiceImpl geoService = Mockito.spy(GeoServiceImpl.class);
        String ip = "172.0.32.11";
        Location actualLocation = geoService.byIp(ip);
        Location expectedLocation = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Assertions.assertEquals(expectedLocation, actualLocation);

    }
}
