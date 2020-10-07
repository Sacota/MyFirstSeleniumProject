import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkout {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test");
driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.active.parent > a")).click();
driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.active.parent > ul > li.level1.nav-1-1.first.active > a")).click();
driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > h2 > a")).click();
driver.findElement(By.cssSelector("#swatch21 > span.swatch-label > img")).click();
driver.findElement(By.cssSelector("#swatch80 > span.swatch-label")).click();
driver.findElement(By.cssSelector("#qty")).sendKeys("1");
driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
driver.findElement(By.cssSelector("#country")).sendKeys("Romania");
driver.findElement(By.cssSelector("#region_id")).sendKeys("Cluj");
driver.findElement(By.cssSelector("#postcode")).sendKeys("407055");
driver.quit();

    }
}
