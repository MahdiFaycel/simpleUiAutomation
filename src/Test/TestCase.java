package Test;


import PageObj.aibPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
    WebDriver driver;
    String os = System.getProperty("os.name").toLowerCase();
    String searchWord = "Car Insurance";
    @BeforeTest
    void setupDriver(){

        // this Condition is Mainly cause i have a Mac (chrome driver for Mac and windows differ)
        if(os.contains("mac")) {
            String libWithDriversLocation = System.getProperty("user.dir") + "/lib/";
            System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        } else {
            String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";
            System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
        }
        driver = new ChromeDriver();

    }

    @Test
    void searchBarTest() {
        driver.get("https://aib.ie/");
        aibPage aibPageSer = new aibPage(driver);
        aibPageSer.setText(searchWord);
        aibPageSer.checkResults(searchWord);

    }

    @AfterTest
    void tearDown(){
        // kill the browser
        driver.close();

    }


}
