package Ex_02_03.start.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Autocomplete2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/marco/IdeaProjects/SeleniumEssentialTraining/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete =  driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1558 Timber Creek Drive, San");

        Thread.sleep(1000);

        WebElement autocoompleteResult = driver.findElement(By.className("pac-item"));
        autocoompleteResult.click();

        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
