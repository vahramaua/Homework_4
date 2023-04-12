import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoAmTest {

    @Test
    public void testAutoAm() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://auto.am/");

        WebElement searchBox = driver.findElement(By.id("text"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));

        searchBox.sendKeys("BMW");
        searchButton.click();
        System.out.println("Page title is: " + driver.getTitle());


        driver.quit();
    }
}