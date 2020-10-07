import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");

        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Amalia");
        driver.findElement(By.cssSelector("#lastname ")).sendKeys("Sacota");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("amalia.sacota@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();

    }
}
