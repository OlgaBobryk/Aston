import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;


public class MtsTopUpTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        String logo = driver.findElement(By.xpath("//h2 [contains (text(),  'Онлайн пополнение ')]")).getText();
        Assert.assertEquals(logo, "Онлайн пополнение\n" +
                "без комиссии", "не совпадает");


        List<WebElement> carts = driver.findElements(By.xpath("//div [@class='pay__partners']/ul/li"));
        Assert.assertEquals(carts.size(), 5, "не совпадает");

        WebElement link = driver.findElement(By.xpath("//a [contains (text(), 'Подробнее')]"));
        Assert.assertTrue(link.isEnabled());

        WebElement phoneInput = driver.findElement(By.xpath("//input [@class='phone'] "));
        phoneInput.sendKeys("29777777777");
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.sendKeys("5");
        WebElement button = driver.findElement(By.xpath("//form[@id='pay-connection']/button"));
        button.click();
        WebElement cartInput = driver.findElement(By.xpath("//app-card-input"));
        Assert.assertTrue(cartInput.isDisplayed());

    }
}