import Config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pageobject.OrderPage;


public class OrderTest extends BaseTest {
    OrderPage orderPage = new OrderPage();

    @BeforeEach
    public void setOrderPage() {

        Selenide.open(orderPage.siteOrder);
    }

    @DisplayName("Оформление заказа, дата сегодня, период сутки, цвет Черный")
    @Test
    public void testOneOrder() {
        orderPage.setNameOrder()
                .setSurnameOrder()
                .setAddressOrder()
                .setStationOrder()
                .setPhoneNumberOrder()
                .nextOrderButtonClick()
                .setDate()
                .setPeriod(orderPage.periodOrderDay)
                .setScooter(orderPage.colorScooterBlack)
                .setCommentOrder()
                .nextOrderButtonClick()
                .yesButtonClick()
                .getTextOfWindowOfSuccessfulOrder().contains("Заказ оформлен");
    }

    @DisplayName("Оформление заказа, дата следующий месяц, период четверо суток, цвет серый")
    @Test
    public void testTwoOrder() {
        orderPage.setNameOrder()
                .setSurnameOrder()
                .setAddressOrder()
                .setStationOrder()
                .setPhoneNumberOrder()
                .nextOrderButtonClick()
                .setDate()
                .setPeriod(orderPage.periodOrderFourDay)
                .setScooter(orderPage.colorScooterGrey)
                .setCommentOrder()
                .nextOrderButtonClick()
                .yesButtonClick()
                .getTextOfWindowOfSuccessfulOrder().contains("Заказ оформлен");
    }
}
