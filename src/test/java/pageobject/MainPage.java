package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public static SelenideElement
            QuestionOneСontent = $("#accordion__panel-0"),
            QuestionTwoСontent = $("#accordion__panel-1"),
            QuestionThreeСontent = $("#accordion__panel-2"),
            QuestionFourСontent = $("#accordion__panel-3"),
            QuestionFiveСontent = $("#accordion__panel-4"),
            QuestionSixСontent = $("#accordion__panel-5"),
            QuestionSevenСontent = $("#accordion__panel-6"),
            QuestionEightСontent = $("#accordion__panel-7");
    public String QuestionOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String QuestionTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String QuestionThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String QuestionFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String QuestionFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String QuestionSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String QuestionSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String QuestionEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public SelenideElement
            orderButton = $x(".//button[(@class = 'Button_Button__ra12g' and (text()='Заказать'))]"),
            downOrderButton = $x(".//div[@class='Home_FinishButton__1_cWm']/button");
    private SelenideElement
            scrollQuestions = $((".Home_SubHeader__zwi_E")),
            QuestionOne = $x(".//div[@aria-controls='accordion__panel-0']"),
            QuestionTwo = $x(".//div[@aria-controls='accordion__panel-1']"),
            QuestionThree = $x(".//div[@aria-controls='accordion__panel-2']"),
            QuestionFour = $x(".//div[@aria-controls='accordion__panel-3']"),
            QuestionFive = $x(".//div[@aria-controls='accordion__panel-4']"),
            QuestionSix = $x(".//div[@aria-controls='accordion__panel-5']"),
            QuestionSeven = $x(".//div[@aria-controls='accordion__panel-6']"),
            QuestionEight = $x(".//div[@aria-controls='accordion__panel-7']");

    public MainPage() {
    }
    @Step("Скролл до элемента FAQ")
    public MainPage scrollToImportantQuestions() {
        $(byText("Вопросы о важном")).scrollTo();
        return this;
    }

    @Step("Кликаем по первому вопросу")
    public MainPage clickButtonOneQuestion() {
        QuestionOne.click();
        return this;

    }

    @Step("Кликаем по второму вопросу")
    public MainPage clickButtonTwoQuestion() {
        QuestionTwo.click();
        return this;
    }

    @Step("Кликаем по третьему вопросу")
    public MainPage clickButtonThreeQuestion() {
        QuestionThree.click();
        return this;
    }

    @Step("Кликаем по четвертому вопросу")
    public MainPage clickButtonFourQuestion() {
        QuestionFour.click();
        return this;
    }

    @Step("Кликаем по пятому вопросу")
    public MainPage clickButtonFiveQuestion() {
        QuestionFive.click();
        return this;
    }

    @Step("Кликаем по шестому вопросу")
    public MainPage clickButtonSixQuestion() {
        QuestionSix.click();
        return this;
    }

    @Step("Кликаем по седьмому вопросу")
    public MainPage clickButtonSevenQuestion() {
        QuestionSeven.click();
        return this;
    }

    @Step("Кликаем по восьмому вопросу")
    public MainPage clickButtonEightQuestion() {
        QuestionEight.click();
        return this;
    }

    @Step("Нажатие на кнопку Заказать в верхнем углу")
    public MainPage clickOrderButton() {
        orderButton.click();
        return this;
    }

    @Step("Нажатие на кнопку Заказать внизу")
    public MainPage clickDownOrderButton() {
        downOrderButton.click();
        return this;
    }
}
