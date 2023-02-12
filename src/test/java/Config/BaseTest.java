package Config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest extends WebDriverProvider {
    @BeforeEach
    public void openSite() {
        get();
        Configuration.baseUrl = config.getBaseUrl();
    }

}
