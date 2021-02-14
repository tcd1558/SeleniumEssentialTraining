package Ex_02_07.start.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/marco/IdeaProjects/SeleniumEssentialTraining/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        // no sleep necessary. I guess invoking a javascript takes more time. enough time to
        // open the modal totally.
        try {
            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement closeButton = driver.findElement(By.id("close-button"));
        //closeButton.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click;", closeButton);

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
