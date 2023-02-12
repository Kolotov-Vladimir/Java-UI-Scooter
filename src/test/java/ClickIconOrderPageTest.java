import Config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pageobject.OrderPage;

import static com.codeborne.selenide.WebDriverRunner.url;

public class ClickIconOrderPageTest extends BaseTest {
    OrderPage orderPage = new OrderPage();

    @BeforeEach
    public void setOrderPage() {
        Selenide.open(orderPage.siteOrder);
    }

    @DisplayName("Клик по иконке самоката и переход на главную страницу")
    @Test
    public void testScooterIconClick() {
        orderPage.scooterIconClick();
        url().equals(config.getBaseUrl());
    }

    @DisplayName("Клик по иконке Яндекса и переход на страницу Дзена")
    @Test
    public void testYandexIconClick() {
        orderPage.yandexIconClick();
        url().contains("dzen.ru");
        Selenide.closeWindow();
    }
}
