package Ex_01_04.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class BHPSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/marco/IdeaProjects/SeleniumEssentialTraining/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("https://www.bhphotovideo.com/");

        // Find the text input element by its name
        WebElement element22 = driver.findElement(By.name("Ntt"));

        // Enter something to search for
        element22.sendKeys("minx min 22");

        // Now submit the form
        element22.submit();

        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the text input element by its name
        WebElement element301 = driver.findElement(By.name("Ntt"));

        // Enter something to search for
        element301.clear();
        element301.sendKeys("minx x301");

        // Now submit the form
        element301.submit();

        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("Ntt"));

        // Enter something to search for
        //element.sendKeys("\b\b\b\b\b\b\b\b\b logitech brio");
        //element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys("\b\b\b\b\b\b\b\b\b logitech brio");

        // Now submit the form
        element.submit();

        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Close the browser
        driver.quit();
    }
}
