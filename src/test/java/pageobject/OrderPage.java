package pageobject;

import Config.GenerateUser;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {

    public static SelenideElement
            scooterIcon = $(".Header_LogoScooter__3lsAR"),
            yandexIcon = $(".Header_LogoYandex__3TSOI"),
            nameOrder = $x(".//input[@placeholder='* Имя']"),
            surnameOrder = $x(".//input[@placeholder='* Фамилия']"),
            addressOrder = $x(".//input[@placeholder='* Адрес: куда привезти заказ']"),
            stationOrder = $x(".//input[@placeholder='* Станция метро']"),
            telephoneOrder = $x(".//input[@placeholder='* Телефон: на него позвонит курьер']"),
            nextOrderButton = $x(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM']"),
            whenOrder = $x(".//input[@placeholder='* Когда привезти самокат']"),
            dateOrder = $x(".//div[contains(@class, 'react-datepicker__day') and (@tabindex='0')]"),
            dateNextMonthOrder = $x(".//button[@aria-label ='Next Month']"),
            periodOrder = $(".Dropdown-placeholder"),
            periodOrderDay = $x(".//div[@class='Dropdown-option'][1]"),
            periodOrderFourDay = $x(".//div[@class='Dropdown-option'][4]"),
            colorScooterBlack = $x("//*[@id='black']"),
            colorScooterGrey = $x("//*[@id='grey']"),
            commentOrder = $x(".//input[@placeholder='Комментарий для курьера']"),
            yesButton = $x(".//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text()='Да'))]"),
            finishModalWindow = $x(".//div[@class = 'Order_ModalHeader__3FDaJ']"),
            firstStation = $x(".//button[@value='1']");
    public static final String SiteOrder = "order";
    GenerateUser generateUser = new GenerateUser();

    public OrderPage() {
    }

    @Step("Клик по иконке Самоката")
    public OrderPage scooterIconClick() {
        scooterIcon.click();
        return this;
    }

    @Step("Клик по иконке Яндекса")
    public OrderPage yandexIconClick() {
        yandexIcon.click();
        return this;
    }

    @Step("Заполнение имени")
    public OrderPage setNameOrder() {
        nameOrder.setValue(generateUser.name());
        return this;
    }

    @Step("Заполнение фамилии")
    public OrderPage setSurnameOrder() {
        surnameOrder.setValue(generateUser.surname());
        return this;
    }

    @Step("Заполнение адреса")
    public OrderPage setAddressOrder() {
        addressOrder.setValue(generateUser.address());
        return this;
    }

    @Step("Заполнение номера телефона")
    public OrderPage setPhoneNumberOrder() {
        telephoneOrder.setValue(generateUser.phoneNumber());
        return this;
    }

    @Step("Заполнение комментария")
    public OrderPage setCommentOrder() {
        commentOrder.setValue(generateUser.comment());
        return this;
    }

    @Step("Заполнение станции")
    public OrderPage setStationOrder() {
        stationOrder.click();
        firstStation.click();
        return this;
    }

    @Step("Нажатие на кнопку 'Далее'")
    public OrderPage nextOrderButtonClick() {
        nextOrderButton.click();
        return this;
    }

    @Step("метод заполнения даты следующего месяца")
    public OrderPage setNextMonthDateButton() {
        whenOrder.click();
        dateNextMonthOrder.click();
        dateOrder.click();
        return this;
    }

    @Step("метод заполнения даты на сегодняшний день")
    public OrderPage setDate() {
        whenOrder.click();
        dateOrder.click();
        return this;
    }

    @Step("метод заполнения срока аренды")
    public OrderPage setPeriod(SelenideElement period) {
        periodOrder.click();
        period.click();
        return this;
    }

    @Step("метод выбора цвета самоката")
    public OrderPage setScooter(SelenideElement colorScooter) {
        colorScooter.click();
        return this;
    }

    @Step("метод заполнения даты на сегодняшний день")
    public OrderPage yesButtonClick() {
        yesButton.click();
        return this;
    }

    @Step("метод возврата текста окна завершения заказа")
    public String getTextOfWindowOfSuccessfulOrder() {
        return finishModalWindow.getText();
    }

}
