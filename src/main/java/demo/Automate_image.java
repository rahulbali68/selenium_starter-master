package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_image {

    WebDriver driver;

    public Automate_image() {

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

    public void automateImage() {

        // Navigate to the URL
        driver.get("https://in.bookmyshow.com/explore/home/chennai");

        // Find the image URLs for all "Recommended Movies"
        List<WebElement> recommendedMovies = driver.findElements(By.cssSelector(".carousel-reco .reco-tile img"));
        for (WebElement movie : recommendedMovies) {
            String imageURL = movie.getAttribute("src");
            System.out.println("Recommended Movie Image URL: " + imageURL);
        }

        // Find the Name & Language of the 2nd item in the "Premiere" list
        List<WebElement> premiereMovies = driver.findElements(By.cssSelector(".carousel-premiere .reco-tile"));
        if (premiereMovies.size() >= 2) {
            WebElement secondPremiereMovie = premiereMovies.get(1);
            String movieName = secondPremiereMovie.findElement(By.cssSelector(".reco-card-content h4")).getText();
            String movieLanguage = secondPremiereMovie.findElement(By.cssSelector(".reco-card-content p")).getText();
            System.out.println("\n2nd Premiere Movie Name: " + movieName);
            System.out.println("2nd Premiere Movie Language: " + movieLanguage);
        } else {
            System.out.println("\nNot enough premiere movies to retrieve the 2nd movie's details.");
        }

    }

}
