package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Image_Url {

    WebDriver driver;

    public Automate_Image_Url() {

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

    // driver.quit();

    // WebElement element = driver.findElement(
    // By.xpath("//*[@id='super-container']/div[2]/section[1]/div/div/div[1]/section/div/div[1]/img"));

    // System.out.println(element);

    // List<WebElement> element = driver.findElements(By.tagName("img"));
    // List<WebElement> recommendedMovieElements = driver
    // .findElements(By.xpath("//div[contains(@class,
    // 'recommended-movie-card')]//img"));

    // System.out.println(recommendedMovieElements);

    // int count = element.size();
    // System.out.println(count);

    // }
    // Thread.sleep(3000);
    // WebElement element = driver.findElement(
    // By.xpath("//img[@class='poster__Image-sc-echj48-5 fqGhMS\']"));

    // WebElement element =
    // driver.findElement(By.xpath("//img[@class='poster__Image-sc-echj48-5
    // fqGhMS']"));
    // Thread.sleep(3000);

    // System.out.println(element.getAttribute("src"));

    public void automateimgUrl() throws InterruptedException {
        driver.get("https://in.bookmyshow.com/explore/home/chennai");

        // try {
        // Thread.sleep(3000); // Allow time for the page to load

        // List<WebElement> moviesUrl = driver.findElements(
        // By.xpath("//div[@id=\"super-container\"]/div[2]/div[3]/div[1]/div[2]/div/div//img"));
        // for (WebElement movie : moviesUrl) {
        // String imgUrl = movie.getAttribute("src");
        // System.out.println("Recommended Movie Image URL: " + imgUrl);
        // }
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        // String namep = driver.findElement(By.xpath(
        // "//*[@id=\"https://in.bookmyshow.com/chennai/movies/somewhere-in-queens/ET00366830-1\"]/div/div[2]/div/div/img"))
        // .getText();
        // System.out.println("Name Print" + namep);

        // System.out.println("hiii");
        // try {

        // Thread.sleep(3000);
        // List<WebElement> name = driver
        // .findElements(By.className("//div[@class='sc-7o7nez-0 iHsoLV']"));
        // System.out.println("hello" + name.size());
        // if (name.size() >= 2) {
        // WebElement secondMovie = name.get(1);
        // System.out.println("aarti" + secondMovie);
        // String na = secondMovie.findElement(By.tagName(
        // "Somewhere in Queens"))
        // .getText();
        // String language = secondMovie.findElement(By.xpath(
        // "/html/body/div[1]/div[1]/div[2]/div[3]/div[1]/div[6]/div/div/div/div[2]/div/div[1]/a[2]/div/div[3]/div[2]/div"))
        // .getText();

        // System.out.println(na);
        // System.out.println(language);

        // }
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        Thread.sleep(5000);

        // WebDriverWait wait = new WebDriverWait(driver, 30);

        // List<WebElement> listElement = driver.findElements(By.xpath("//div[@class=
        // 'sc-7o7nez-0 iHsoLV']"));
        // System.out.println("List size " + listElement.size());
        List<WebElement> listElement = driver
                .findElements(By.xpath("//div[@class='sc-7o7nez-0 iHsoLV']"));
        System.out.println("List size: " + listElement.size());

    }

}
