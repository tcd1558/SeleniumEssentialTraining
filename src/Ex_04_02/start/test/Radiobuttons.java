package Ex_04_02.start.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/marco/IdeaProjects/SeleniumEssentialTraining/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));

        radioButton2.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        radioButton3.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        radioButton1.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        driver.get("https://formy-project.herokuapp.com/checkbox");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkbox1.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkbox2.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkbox3.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
