import Config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.MainPage;

import static com.codeborne.selenide.Condition.text;

public class QuestionTest extends BaseTest {
    MainPage mainPage = new MainPage();
    @BeforeEach
    public void setMainPage(){
        Selenide.open("");
        mainPage.scrollToImportantQuestions();
    }
    @DisplayName("Проверка текста первого вопроса")
    @Test
    public void testQuestionOne() {
        mainPage.clickButtonOneQuestion();
        MainPage.QuestionOneСontent.shouldHave(text(mainPage.QuestionOneText));
    }
    @DisplayName("Проверка текста второго вопроса")
    @Test
    public void testQuestionTwo() {
        mainPage.clickButtonTwoQuestion();
        MainPage.QuestionTwoСontent.shouldHave(text(mainPage.QuestionTwoText));
    }
    @DisplayName("Проверка текста третьего вопроса")
    @Test
    public void testQuestionThree() {
        mainPage.clickButtonThreeQuestion();
        MainPage.QuestionThreeСontent.shouldHave(text(mainPage.QuestionThreeText));
    }
    @DisplayName("Проверка текста четвертого вопроса")
    @Test
    public void testQuestionFour() {
        mainPage.clickButtonFourQuestion();
        MainPage.QuestionFourСontent.shouldHave(text(mainPage.QuestionFourText));
    }
    @DisplayName("Проверка текста пятого вопроса")
    @Test
    public void testQuestionFive() {
        mainPage.clickButtonFiveQuestion();
        MainPage.QuestionFiveСontent.shouldHave(text(mainPage.QuestionFiveText));
    }
    @DisplayName("Проверка текста шестого вопроса")
    @Test
    public void testQuestionSix() {
        mainPage.clickButtonSixQuestion();
        MainPage.QuestionSixСontent.shouldHave(text(mainPage.QuestionSixText));
    }
    @DisplayName("Проверка текста седьмого вопроса")
    @Test
    public void testQuestionSeven() {
        mainPage.clickButtonSevenQuestion();
        MainPage.QuestionSevenСontent.shouldHave(text(mainPage.QuestionSevenText));
    }
    @DisplayName("Проверка текста восьмого вопроса")
    @Test
    public void testQuestionEight() {
        mainPage.clickButtonEightQuestion();
        MainPage.QuestionEightСontent.shouldHave(text(mainPage.QuestionEightText));
    }
}
