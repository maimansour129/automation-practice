import framework.engine.DriverFactory;
import framework.engine.JsonFileManager;
import framework.engine.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.applicationcache.model.ApplicationCacheStatusUpdated;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePageAfterLogin;
import pages.LoginPage;
import pages.signupPage;


public class userTestLogin {

    WebDriver driver;
    JsonFileManager testData;


    @Test
    public void test(){

        new signupPage(driver).signUpButtonClick().signUpButtonClick()
                .fillSignupForm(testData.getTestData("name"),testData.getTestData("email"))
                .signUpsubmit()
                .fillAccountInfo(
                        testData.getTestData("name"),
                        testData.getTestData("password"),
                        testData.getTestData("days"),
                        testData.getTestData("months"),
                        testData.getTestData("years"),
                        testData.getTestData("Firstname"),
                        testData.getTestData("lastname"),
                        testData.getTestData("address"),
                        testData.getTestData("Country"),
                        testData.getTestData("state"),
                        testData.getTestData("city"),
                        testData.getTestData("zip"),
                        testData.getTestData("mobile"))
                .CreateAccountClick();
    }
    @Test
    public void test2(){
        new HomePage(driver)
                .navigateToHomePage()
                .verifyHomePageVisibility( "Home");
        new LoginPage(driver)
                .navigateToSignupLoginPage()
                .assertLoginPage("Login to your account")
                .enteremail(testData.getTestData("email"))
                .enterPassword(testData.getTestData("password"))
                .submitLogin();
        System.out.println("end login");

        new HomePageAfterLogin(driver).verifyLoggedInASVisibility("Logged in as "+ testData.getTestData("name"))
                .deleteAccount()
                .assertAccountDeleted("ACCOUNT DELETED!");
    }

    @BeforeClass
    public void beforeClass() {
        PropertiesReader.loadProperties();
        testData = new JsonFileManager("src/test/resources/Test Data/TestData.json");

    }

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.initDriver("chrome",10,true);
        new HomePage(driver).navigateToHomePage();
    }

    @AfterMethod(description = "Close driver")
    public void afterMethod() {
       driver.quit();
    }

}