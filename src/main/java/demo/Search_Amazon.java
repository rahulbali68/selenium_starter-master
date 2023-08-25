package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_Amazon {

    WebDriver driver;

    public Search_Amazon() {

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

    public void searchAmazon() {

        // Nevigate to URL https://www.google.co.in/

        driver.get("https://www.google.co.in/");
        // Searching Amazon Using Locator "By name(q).sendeKeys(" amazon")

        driver.findElement(By.name("q")).sendKeys("amazon");
        // Click On the search button Using Locator "XPath"
        // /html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]
        // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        driver.findElement(By.name("btnK")).click();
        // validate amazon.in Using Locator "XPath"
        // /html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]

        // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));

        // driver.close();

    }

}
