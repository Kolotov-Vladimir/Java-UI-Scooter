package Config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;


import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<Configuration> {
    protected final WebDriverConfig config;
    public WebDriverProvider(){
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    @Override
    public Configuration get() {
        return createDriver();
    }
    public Configuration createDriver() {
        Configuration configuration= new Configuration();
        switch (config.getBrowser()) {
            case CHROME:
                configuration.browser="chrome";
                break;
            case FIREFOX:
                configuration.browser="firefox";
                break;
            default:
                throw new RuntimeException("Непредвиденная ошибка запуска браузера");
            }
            return configuration;
    }
    }

