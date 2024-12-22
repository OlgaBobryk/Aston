
import com.beust.ah.A;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;


public class MainPageTest extends BaseTest {


    @Test (description = "Проверка названия блока")
    public void findTitleOfBlockTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow();
        Assert.assertEquals(mainPage.findBlock(), "Онлайн пополнение\n" +
                "без комиссии", "не совпадает");
    }

    @Test (description = "Проверка отображения платежных карт")
    public void findLogoOfCartsTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .countLogoOfCarts();
        Assert.assertEquals(mainPage.countLogoOfCarts(), 5, "не совпадает");

    }

    @Test (description = "Проверка перехода по ссылке Подробнее о сервисе")
    public void followLinkTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .followLink();
        Assert.assertEquals(mainPage.getUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", " не совпадает");
    }

    @Test (description = "Проверка введенной суммы")
    public void buttonOperationTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setDataForPayment("297777777", "5");
        Assert.assertEquals(mainPage.getSumForPayment(), "5.00 BYN", "Не совпадает");
    }

    @Test (description = "Проверка надписей в пустых полях Формы оплаты для Услуги связм")
    public void placeholdersOfFirstPaymentTypeTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(0);

        Assert.assertEquals(mainPage.getTextForPhoneInputInFirstForm(), "Номер телефона", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForSumInputInFirstForm(), "Сумма", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForEmailInputInFirstForm(), "E-mail для отправки чека", "Не совпадает");

    }

    @Test(description = "Проверка надписей в пустых полях Формы оплаты для Домашний интернет")
    public void placeholdersOfSecondPaymentTypeTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(1);

        Assert.assertEquals(mainPage.getTextForPhoneInputInSecondForm(), "Номер абонента", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForSumInputInSecondForm(), "Сумма", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForEmailInputInSecondForm(), "E-mail для отправки чека", "Не совпадает");


    }

    @Test (description = "Проверка надписей в пустых полях Формы оплаты для Рассрочка")
    public void placeholdersOfThirdPaymentTypeTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(2);

        Assert.assertEquals(mainPage.getTextForAccountNumberInputInThirdForm(), "Номер счета на 44", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForSumInputInThirdForm(), "Сумма", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForEmailInputInThirdForm(), "E-mail для отправки чека", "Не совпадает");


    }

    @Test (description = "Проверка надписей в пустых полях Формы оплаты для Задолженность")
    public void placeholdersOfForthPaymentTypeTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(3);

        Assert.assertEquals(mainPage.getTextForAccountNumberInputInFourthForm(), "Номер счета на 2073", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForSumInputInFourthForm(), "Сумма", "Не совпадает");
        Assert.assertEquals(mainPage.getTextForEmailInputInFourthForm(), "E-mail для отправки чека", "Не совпадает");


    }

    @Test (description = "Проверка введенной суммы на кнопке Продолжить в форме ввода данных карты")
    public void checkSumInButtonOfPaymentTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(0)
                .setDataForPayment("297777777", "5");
        Assert.assertEquals(mainPage.getSumInButtonOfPaymentForm(), "Оплатить 5.00 BYN", "Не совпадает");
    }

    @Test (description = "Проверка введенного телефона  в форме ввода данных карты")
    public void checkPhoneNumberOfPaymentTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(0)
                .setDataForPayment("297777777", "5");
        Assert.assertEquals(mainPage.getPhoneNumberInPayment(), "Услуги связи Номер:375297777777", "Не совпадает");
    }

    @Test (description = "Проверка надписей в полях ввода данных карты")
    public void checkPlaceholdersInPaymentFormTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(0)
                .setDataForPayment("297777777", "5")
                .switchToFramePayment();

        Assert.assertEquals(mainPage.placeholderNumberCartInput(), "Номер карты", "Не совпадает");
        Assert.assertEquals(mainPage.placeholdePeriodInput(), "Срок действия", "Не совпадает");
        Assert.assertEquals(mainPage.placeholderCvcInput(), "CVC", "Не совпадает");
        Assert.assertEquals(mainPage.placeholderNameInput(), "Имя держателя (как на карте)", "Не совпадает");

    }

    @Test (description = "Проверка наличия иконок карт на форме ввода данных карты")
    public void checkIconsOfCartsTest() {
        MainPageOnlinePayment mainPage = new MainPageOnlinePayment(driver);
        mainPage.openMainPage()
                .closeCookieWindow()
                .setTypeOfPayment(0)
                .setDataForPayment("297777777", "5")
                .switchToFramePayment();

        Assert.assertTrue(mainPage.checkIconsOfCarts(), "Карты не отображены");
    }
}
