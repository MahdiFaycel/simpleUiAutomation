package PageObj;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class aibPage {
    WebDriver driver ;

    By searchInput = By.cssSelector("#search-input");
    By searchButton = By.className("search-icon");
    By acceptCookies = By.id("acceptCookies");
    By resultDetails = By.className("result-details");
    By allResults = By.xpath("//*[@id=\"torso\"]/div[2]/div[3]/div/div[2]/div/div[2]/p[1]/a");

    public aibPage(WebDriver driver){
        this.driver = driver;
    }

    // simple function to input a text in search Bar
    public void setText(String text){
        driver.findElement(acceptCookies).click();
        driver.findElement(searchInput).sendKeys(text); //can replace (LN 24, 25)  driver.findElement(searchInput).sendKeys(text, Keys.ENTER);
        driver.findElement(searchButton).click();
    }
    public void checkResults(String text){
        // Checking the Result Title if it include the text searched
        String expectedResultTitle = "Search results for '"+text+"'" ;
        String actualResultTitle = getResultDetail();
        Assert.assertEquals(actualResultTitle, expectedResultTitle);

        // I'm checking the first result link if it match (can be name or i can get the list Under the Div)
        String expectedResultsHref = "https://aib.ie/our-products/insurance/car-insurance";
        String actualHref = getFirstDisplayedResult();
        Assert.assertEquals(actualHref, expectedResultsHref);
    }

    public String getResultDetail(){
       return driver.findElement(resultDetails).getText();
    }

    public String getFirstDisplayedResult(){
        // getting first Displayed Result link
        return driver.findElement(allResults).getAttribute("href");
    }
}
