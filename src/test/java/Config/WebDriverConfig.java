package Config;
import org.aeonbits.owner.Config;


public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://qa-scooter.praktikum-services.ru/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();
}
