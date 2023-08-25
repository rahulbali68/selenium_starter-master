package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedProfile {

    WebDriver driver;

    public LinkedProfile() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void linked() {

        // driver.get("https://www.linkedin.com/");

        // driver.get("https://in.linkedin.com/");

        driver.get("https://www.linkedin.com/login");

        // driver.findElement(By.id("session_key")).sendKeys("artisharma89223@gmail.com");
        driver.findElement(By.id("username")).sendKeys("artisharma89223@gmail.com");
        // driver.findElement(By.linkText("Email or
        // phone")).sendKeys("artisharma89223@gmail.com");
        driver.findElement(By.id("password")).sendKeys("EN_xp,HU#a92wKw");
        driver.findElement(By.xpath("//*[@id=\'organic-div\']/form/div[3]/button")).click();

        driver.findElement(By.xpath("//*[@id='global-nav']/div/nav/ul/li[1]/a/span")).click();

        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]"))
                .click();
        try {
            Thread.sleep(3000);
            driver.findElement(
                    By.xpath("//*[@id=\'ember1543\']/div[3]/ul/li/div/div[2]/div/a"))
                    .click();

        } catch (Exception e) {

            System.out.println(e);
        } // System.out.println("count view" + count);

        // Thread.sleep(3000);

        // System.out.println("hiii");
        //
        // driver.findElement(By.id("ember17")).click();
        // Thread.sleep(3000);
        // driver.findElement(By.id("ember18")).click();

        // driver.findElement(By.xpath("//*[@id='ember679']/div[3]/ul/li/div/div[2]/div/a/div/div/div/div/span[1]")).click();

    }

}
