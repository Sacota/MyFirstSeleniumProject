import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
       public  void login() {
           System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://google.com");

           driver.manage().window().maximize();
           driver.get("http://testfasttrackit.info/selenium-test");
           driver.findElement(By.cssSelector(" #header > div > div.skip-links > div > a > span.label")).click();
           driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
           driver.findElement(By.cssSelector("#email")).sendKeys(" pirvuamalia@yahoo.com");
           driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
           driver.findElement(By.cssSelector("#send2")).click();
           driver.quit();
       }

        public  void invalidpassword() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("pirvuamalia@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("134567");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }

        public  void withoutpasswordandusername() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("");
        driver.findElement(By.cssSelector("#pass")).sendKeys("");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();

        }

    }




