package pages;
import framework.engine.ElementsAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePageAfterLogin {

    private WebDriver driver;
    private final By loggedInText = By.xpath("//a[contains(.,'Logged in as')]");
    private final By deleteButton = By.linkText("Delete Account");
    private final By accountDeleted = By.cssSelector("div[class='col-sm-9 col-sm-offset-1'] > h2>b");



    public HomePageAfterLogin(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageAfterLogin verifyLoggedInASVisibility(String expectedResult) {


        String homePageIsVisible = driver.findElement(loggedInText).getText();
        //System.out.println("test  "+homePageIsVisible);
        Assert.assertEquals(driver.findElement(loggedInText).getText(),expectedResult);
        return this;
    }

    public HomePageAfterLogin deleteAccount(){
        ElementsAction.click(driver,deleteButton);
        return this;
    }
    public HomePageAfterLogin assertAccountDeleted(String expectedResult){
        Assert.assertEquals(driver.findElement(accountDeleted).getText(), expectedResult);
        return this;

    }
}
