package Ex_06_01.start.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static java.time.ZoneId.*;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/marco/IdeaProjects/SeleniumEssentialTraining/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        //WebElement firstName = driver.findElement(By.id("first-name"));
        //firstName.sendKeys("Ravi");
        driver.findElement(By.id("first-name")).sendKeys("Ravi");


        //Auto complete does not work

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Joshi");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Quality Assurance Manager");

        //Highest level of education: radio-button-3 # 04-02
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='radio-button-3']"));
        radioButton3.click();

        //Sex: Male # 04-02
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        //Years of experience: pull down - 04_04
        WebElement yearsOfExperience = driver.findElement(By.id("select-menu"));
        yearsOfExperience.click();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement button = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[5]"));
        button.click();
        //WebElement button = driver.findElement(By.cssSelector("option[value='1']")).click();


        // Date
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/ZoneId.html
        //https://stackoverflow.com/questions/5046771/how-to-get-todays-date
        //https://www.geeksforgeeks.org/localdate-format-method-in-java/

        WebElement dateField = driver.findElement(By.id("datepicker"));

        //Retrieve today's date and send it with sendKeys

        //ZoneId zoneId = ZoneId.of( "America/Los_Angeles" ) ;
        //LocalDate today = LocalDate.now(zoneId);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        ////dateField.sendKeys("04/04/2103");
        //dateField.sendKeys(formatter.format(today));
        //dateField.sendKeys(Keys.RETURN);

        //try {
        //    TimeUnit.SECONDS.sleep(5);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        // alternatively click today's date from the shown calendar.
        dateField.click();
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement calendarInDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("today day")));
        //WebElement todayInCalendar = driver.findElement(By.className("today day"));
        //Today was pre-selected and should be active
        //WebElement todayInCalendar = driver.findElement(By.className("today active day"));
        // this is more than 1 class. You need to use a cssSelector
        WebElement todayInCalendar = driver.findElement(By.cssSelector(".today.day"));
        //WebElement todayInCalendar = driver.findElement(By.cssSelector(".today.active.day"));
        // When today was submitted with sendKeys, the cssSelector has to include the ".active" class. - something is wrong.
        todayInCalendar.click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //WebElement submitButton = driver.findElement(By.className("btn btn-lg btn-primary")); // class# < 1
        // remember that a class starts with a '.'
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
