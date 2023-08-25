package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuotmatNesttedFame {

    WebDriver driver;

    public AuotmatNesttedFame() {

        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void nestedFrame() {

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // switch top frame

        driver.switchTo().frame("frame-top");

        // switch to letframe
        driver.switchTo().frame("frame-left");
        String text = driver.findElement(By.tagName("body")).getText();
        System.out.println(text);

        // switch to parent frame
        driver.switchTo().parentFrame();

        // switch to middle frmae
        driver.switchTo().frame("frame-middle");
        String middle = driver.findElement(By.id("content")).getText();
        System.out.println(middle);

        // switch to parent frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");

        String right = driver.findElement(By.tagName("body")).getText();
        System.out.println(right);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");

        String bottom = driver.findElement(By.tagName("body")).getText();
        System.out.println(bottom);

        driver.switchTo().defaultContent();

    }

}
