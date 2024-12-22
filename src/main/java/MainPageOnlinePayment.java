import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPageOnlinePayment extends BasePage {


    By cookie = By.xpath("//div/button [contains (text(), 'Отклонить')]");
    By titleBlock = By.xpath("//h2 [contains (text(),  'Онлайн пополнение ')]");
    By logoOfCart = By.xpath("//div [@class='pay__partners']/ul/li");
    By link = By.xpath("//a [contains (text(), 'Подробнее')]");
    By sumInputOfFirstForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='connection-sum']");
    By phoneInputOfFirstForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='connection-phone']");
    By emailInputOfFirstForm = By.xpath(" //form[@class='pay-form opened']/div/input[@id='connection-email']");
    By phoneInputOfSecondForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='internet-phone']");
    By sumInputOfSecondForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='internet-sum']");
    By emailInputOfSecondForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='internet-email']");
    By accountNumber44InputOfThirdForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='score-instalment']");
    By sumInputOfThirdForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='instalment-sum']");
    By emailInputOfThirdForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='instalment-email']");
    By accountNumber2073InputOfFourthForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='score-arrears']");
    By sumInputOfFourthForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='arrears-sum']");
    By emailInputOfFourthForm = By.xpath("//form[@class='pay-form opened']/div/input[@id='arrears-email']");

    By continueButton = By.xpath("//form[@id='pay-connection']/button");
    By newFrame = By.xpath("//iframe[@class='bepaid-iframe']");
    By payForm = By.xpath("//app-root/div[@class='app-wrapper']//div[@class='app-wrapper__content']/div/app-payment-container/section/div[@class='payment-page__container']/div");
    By sumInPayment = By.xpath("//div[@class='pay-description__cost']");
    By phoneNumberInPayment = By.xpath("//div[@class='pay-description__text']");
    By dropdownInput = By.xpath("//div[@class='select__wrapper']");
    By selectList = By.xpath("//ul[@class='select__list']");
    By typeOfPayment = By.xpath("//div[@class='select__wrapper opened']/ul[@class='select__list']/li");
    By sumInButtonSubmit = By.xpath("//div[@class='card-page__container']/div/button[@type='submit']");

    By numberCartInput = By.xpath("//app-card-input/form/div[1]/div[1]/app-input/div/div/div/label");
    By validityPeriodInput = By.xpath("//app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div/label");
    By cvcInput = By.xpath("//app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div/label");
    By nameInput = By.xpath("//app-card-input/form/div[1]/div[3]/app-input/div/div/div/label");
    By iconsOfCarts=By.xpath("//app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img");

    public MainPageOnlinePayment(WebDriver driver) {
        super(driver);
    }

    public MainPageOnlinePayment openMainPage() {
        driver.get("https://www.mts.by/");
        return this;
    }

    public MainPageOnlinePayment closeCookieWindow() {
        if (driver.findElement(cookie).isDisplayed()) {
            driver.findElement(cookie).click();
        }
        return this;

    }

    public String findBlock() {
        String titleOfBlock = driver.findElement(titleBlock).getText();
        return titleOfBlock;
    }

    public int countLogoOfCarts() {
        List<WebElement> cartsList = driver.findElements(logoOfCart);
        return cartsList.size();

    }

    public MainPageOnlinePayment followLink() {
        driver.findElement(link).click();
        return this;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public MainPageOnlinePayment switchToFramePayment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(newFrame));

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(payForm));
        return this;
    }

    public MainPageOnlinePayment setDataForPayment(String phone, String sum) {
        driver.findElement(phoneInputOfFirstForm).sendKeys(phone);
        driver.findElement(sumInputOfFirstForm).sendKeys(sum);
        driver.findElement(continueButton).click();
        return this;
    }

    public String getSumForPayment() {
        MainPageOnlinePayment page = new MainPageOnlinePayment(driver);
        page.switchToFramePayment();
        String sum = driver.findElement(sumInPayment).getText();
        return sum;
    }

    public MainPageOnlinePayment setTypeOfPayment(int i) {
        driver.findElement(dropdownInput).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectList));
        driver.findElement(typeOfPayment);
        List<WebElement> webElementList = driver.findElements(typeOfPayment);
        webElementList.get(i).click();
        return this;
    }

    public String getTextForPhoneInputInFirstForm() {
        String phonePlaceholder = driver.findElement(phoneInputOfFirstForm).getAttribute("placeholder");
        return phonePlaceholder;
    }

    public String getTextForSumInputInFirstForm() {
        String sumPlaceholder = driver.findElement(sumInputOfFirstForm).getAttribute("placeholder");
        return sumPlaceholder;
    }

    public String getTextForEmailInputInFirstForm() {
        String emailPlaceholder = driver.findElement(emailInputOfFirstForm).getAttribute("placeholder");
        return emailPlaceholder;
    }

    public String getTextForPhoneInputInSecondForm() {
        String phonePlaceholder = driver.findElement(phoneInputOfSecondForm).getAttribute("placeholder");
        return phonePlaceholder;
    }

    public String getTextForSumInputInSecondForm() {
        String sumPlaceholder = driver.findElement(sumInputOfSecondForm).getAttribute("placeholder");
        return sumPlaceholder;
    }

    public String getTextForEmailInputInSecondForm() {
        String emailPlaceholder = driver.findElement(emailInputOfSecondForm).getAttribute("placeholder");
        return emailPlaceholder;
    }

    public String getTextForAccountNumberInputInThirdForm() {
        String accountNumber = driver.findElement(accountNumber44InputOfThirdForm).getAttribute("placeholder");
        return accountNumber;
    }

    public String getTextForSumInputInThirdForm() {
        String sumPlaceholder = driver.findElement(sumInputOfThirdForm).getAttribute("placeholder");
        return sumPlaceholder;
    }

    public String getTextForEmailInputInThirdForm() {
        String emailPlaceholder = driver.findElement(emailInputOfThirdForm).getAttribute("placeholder");
        return emailPlaceholder;
    }

    public String getTextForAccountNumberInputInFourthForm() {
        String accountNumber = driver.findElement(accountNumber2073InputOfFourthForm).getAttribute("placeholder");
        return accountNumber;
    }

    public String getTextForSumInputInFourthForm() {
        String sumPlaceholder = driver.findElement(sumInputOfFourthForm).getAttribute("placeholder");
        return sumPlaceholder;
    }

    public String getTextForEmailInputInFourthForm() {
        String emailPlaceholder = driver.findElement(emailInputOfFourthForm).getAttribute("placeholder");
        return emailPlaceholder;
    }

    public String getSumInButtonOfPaymentForm() {
        MainPageOnlinePayment page = new MainPageOnlinePayment(driver);
        page.switchToFramePayment();
        String sumInButton = driver.findElement(sumInButtonSubmit).getText();
        return sumInButton;
    }

    public String getPhoneNumberInPayment() {
        MainPageOnlinePayment page = new MainPageOnlinePayment(driver);
        page.switchToFramePayment();
        String phone = driver.findElement(phoneNumberInPayment).getText();
        return phone;
    }

    public String placeholderNumberCartInput() {
        String placeholder = driver.findElement(numberCartInput).getText();
        return placeholder;
    }

    public String placeholdePeriodInput() {
        String placeholder = driver.findElement(validityPeriodInput).getText();
        return placeholder;
    }

    public String placeholderCvcInput() {
        String placeholder = driver.findElement(cvcInput).getText();
        return placeholder;
    }

    public String placeholderNameInput() {
        String placeholder = driver.findElement(nameInput).getText();
        return placeholder;
    }

    public boolean checkIconsOfCarts(){
               return  driver.findElement(iconsOfCarts).isDisplayed();
    }
}
