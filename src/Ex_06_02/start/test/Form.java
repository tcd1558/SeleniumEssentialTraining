package Ex_06_02.start.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/marco/IdeaProjects/SeleniumEssentialTraining/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");

        driver.findElement(By.id("last-name")).sendKeys("Doe");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        //driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        //driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.cssSelector(".today.day")).click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alertBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        //Expected text: "The form was successfully submitted!"
        String alertText = alertBar.getText();
        //assert needs JUnit-x.y.z.jar

        driver.quit();
    }
}
