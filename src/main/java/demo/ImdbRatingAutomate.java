package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImdbRatingAutomate {

    WebDriver driver;

    public ImdbRatingAutomate() {

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

    public void rating() {

        driver.get("https://www.imdb.com/chart/top/");

        List<WebElement> list = driver.findElements(
                By.xpath("//div[@class='sc-b85248f1-0 bCmTgE cli-children\']"));
        System.out.println("list" + list.size());

        for (WebElement webElements : list) {

            // System.out.println(webElement.getText());

            String rating = "9.3";
            // String year = "1921";
            if (rating.equals("9.3")) {
                //

                System.out.println("+++++++++++++++++++++");
                System.out.println("HighestRating movie name :::" + webElements.getText());
                break;
            }

        }

        for (WebElement oldElement : list) {

            WebElement single = driver.findElement(By.linkText("131. The Kid"));

            String check = single.getText();
            if (check.equals("131. The Kid")) {
                System.out.println("Old year movie name: " + check);
                break;

            } else {

                System.out.println("not getting");
            }

        }

        System.out.println("Movie include in table ::: " + list.size());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // for (WebElement recent : list) {

        // String s = "2023";

        // if (s.equals(2023)) {

        // System.out.println("getting " + s);
        // }
        //
        // }

        System.out.println("+++++++++++++++++++++++++++++++++" + "top rating");
        driver.get("https://www.imdb.com/chart/top/?sort=release_date%2Cdesc");
        List<WebElement> toprate = driver
                .findElements(By.xpath("//div[@class='sc-b85248f1-0 bCmTgE cli-children']"));
        String year = "2023";
        String moivename = "18. Spider-Man: Across the Spider-Verse";
        String othermovie = "36. Oppenheimer";
        // System.out.println(toprate.ge);
        for (WebElement top : toprate) {

            if (year.equals("2023")
                    && othermovie.equals("36. Oppenheimer") && year.equals("2023"))

                System.out.println(top.getText());
            break;

            // else
            // {
            // System.out.println("not getting");
            // }

        }

        System.out.println("+++++++++++++++++++++++++++++++++++" + "userrating");

        driver.get("https://www.imdb.com/chart/top/?sort=num_votes%2Cdesc");

        List<WebElement> userrating = driver
                .findElements(By.xpath("//div[@class='sc-b85248f1-0 bCmTgE cli-children']"));
        String urating = "9.3";
        for (WebElement userr : userrating) {

            if (urating.equals("9.3")) {

                System.out.println(userr.getText());

                break;
            }

        }
    }

}
