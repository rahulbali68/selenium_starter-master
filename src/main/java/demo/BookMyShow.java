package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

    WebDriver driver;

    public BookMyShow() {

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

    public void bookmyshow() {

        // navigate URL
        driver.get("https://in.bookmyshow.com/explore/home/chennai");

        List<WebElement> elementSize = driver.findElements(By.tagName("a"));

        int count = elementSize.size();

        System.out.println("HyperLinks Count " + count);

    }

}
