import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class MtsTopUpTest {


    @Test(description = "Проверка названия блока")
    public void findTitleOfBlock() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement cookie = driver.findElement(By.xpath("//div/button [contains (text(), 'Отклонить')]"));
        if (cookie.isDisplayed()) {
            cookie.click();
        }

        String logo = driver.findElement(By.xpath("//h2 [contains (text(),  'Онлайн пополнение ')]")).getText();
        driver.quit();
        Assert.assertEquals(logo, "Онлайн пополнение\n" +
                "без комиссии", "не совпадает");
    }


    @Test(description = "Наличе логотипов платежных систем")
    public void findLogoOfCarts() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement cookie = driver.findElement(By.xpath("//div/button [contains (text(), 'Отклонить')]"));
        if (cookie.isDisplayed()) {
            cookie.click();
        }

        List<WebElement> carts = driver.findElements(By.xpath("//div [@class='pay__partners']/ul/li"));
        driver.quit();
        Assert.assertEquals(carts.size(), 5, "не совпадает");
    }


    @Test(description = "Ссылка Подробнее о сервисе")
    public void followLink() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement cookie = driver.findElement(By.xpath("//div/button [contains (text(), 'Отклонить')]"));
        if (cookie.isDisplayed()) {
            cookie.click();
        }

        WebElement link = driver.findElement(By.xpath("//a [contains (text(), 'Подробнее')]"));
        link.click();
        String newLink = driver.getCurrentUrl();
        driver.quit();
        Assert.assertEquals(newLink, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", " не совпадает");
    }


    @Test(description = "Проверка кнопки Продолжить")
    public void buttonOperation() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement cookie = driver.findElement(By.xpath("//div/button [contains (text(), 'Отклонить')]"));
        if (cookie.isDisplayed()) {
            cookie.click();
        }

        WebElement phoneInput = driver.findElement(By.xpath("//input [@class='phone'] "));
        phoneInput.sendKeys("29777777777");
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.sendKeys("5");
        WebElement button = driver.findElement(By.xpath("//form[@id='pay-connection']/button"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']")));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-root/div[@class='app-wrapper']//div[@class='app-wrapper__content']/div/app-payment-container/section/div[@class='payment-page__container']/div")));


        WebElement sum = driver.findElement(By.xpath(" //div[@class='pay-description__cost']"));
        String sumText = sum.getText();
        driver.quit();
        Assert.assertEquals(sumText, "5.00 BYN", "Не совпадает");

    }
}
