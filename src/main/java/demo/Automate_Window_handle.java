package demo;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Window_handle {

    WebDriver driver;

    public Automate_Window_handle() {

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

    public void windowHandle() throws InterruptedException {

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

        driver.switchTo().frame("iframeResult");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);

        // Set<String> windowHandles = driver.getWindowHandles();
        // System.out.println(windowHandles);

        // String originalWindow = driver.getWindowHandle();
        // System.out.println(originalWindow);

        // for (String window : windowHandles) {

        // if(!window.equals(originalWindow)){

        // //driver.switchTo().window(windowHandles);

        // driver.switchTo().window(windowHandles);

        // }

        // }

        String originalWindowHandle = driver.getWindowHandle();
        System.out.println(originalWindowHandle);

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        // Switch to the new window (the popup)
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        System.out.println("hii");

        String newWindowURL = driver.getCurrentUrl();
        System.out.println(newWindowURL);
        String newWindowTitle = driver.getTitle();
        System.out.println(newWindowTitle);

        // //take full screen-shot
        // //1:- step to take screen shot object convert into webdfriver.
        //
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        //
        //
        screenShot.getScreenshotAs(OutputType.FILE);
        //
        File src = screenShot.getScreenshotAs(OutputType.FILE);
        //
        File dest = new File(
                "D:\\CloneProject\\selenium_starter-master\\selenium_starter-master\\src\\main\\java\\demo\\Screenshot\\fullpagfe.png");
        //
        // // copy file image to destination
        // FileUtils.copyFile(src, dest);
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // System.out.println("hiii");

        // driver.switchTo().window(null)

        // String currentURL = driver.getCurrentUrl();
        // System.out.println(currentURL);

        // Close the new window
        driver.close();

        // Switch back to the original window
        driver.switchTo().window(originalWindowHandle);

        // String originalWindowHandle = driver.getWindowHandle();
        System.out.println(originalWindowHandle);

    }

}
