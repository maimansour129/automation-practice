package pages;

import framework.engine.ElementsAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    private WebDriver driver;

    String HomePageUrl = "https://automationexercise.com/";

    // Locators
    private final By homeText = By.linkText("Home");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage navigateToHomePage(){
        driver.navigate().to(HomePageUrl);
        return this;

    }
    public void verifyHomePageVisibility(String expectedResult) {
        String homePageIsVisible = driver.findElement(homeText).getText();
        Assert.assertEquals(homePageIsVisible, expectedResult);
   }



}
