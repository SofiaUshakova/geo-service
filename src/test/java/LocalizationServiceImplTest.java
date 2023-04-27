import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    public void test_locate(){
        LocalizationServiceImpl localizationService = Mockito.spy(LocalizationServiceImpl.class);
        Country country = Country.RUSSIA;
        String messageExp = "Добро пожаловать";
        String messageAct = localizationService.locale(country);
        Assertions.assertEquals(messageExp, messageAct);

    }
}
