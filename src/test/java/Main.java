import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");


            WebDriver driver = new ChromeDriver();
            driver.get("https://google.com");

            driver.get("http://testfasttrackit.info/selenium-test");
            driver.findElement(By.cssSelector(" #header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
            driver.findElement(By.cssSelector("#email")).sendKeys(" pirvuamalia@yahoo.com");
            driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
            driver.findElement(By.cssSelector("#send2")).click();
            driver.quit();

        }

    }

