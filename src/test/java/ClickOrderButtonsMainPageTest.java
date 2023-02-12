import Config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pageobject.MainPage;
import pageobject.OrderPage;

import static com.codeborne.selenide.WebDriverRunner.url;

public class ClickOrderButtonsMainPageTest extends BaseTest {
   MainPage mainPage = new MainPage();
   OrderPage orderPage = new OrderPage();

    @BeforeEach
    public void setOrderPage() {
        Selenide.open("");
    }

    @DisplayName("Нажатие на кнопку Заказать в верхнем углу")
    @Test
    public void testClickOrderButton() {
        mainPage.clickOrderButton();
        url().equals(config.getBaseUrl() + orderPage.siteOrder);
    }

    @DisplayName("Нажатие на кнопку Заказать внизу")
    @Test
    public void testClickDownOrderButton() {
        mainPage.downOrderButton.scrollIntoView(true);
        mainPage.clickDownOrderButton();
        url().equals(config.getBaseUrl());
    }
}
