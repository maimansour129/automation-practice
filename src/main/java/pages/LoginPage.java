package pages;
import framework.engine.ElementsAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class LoginPage {
    private WebDriver driver;
    private final By LoginToYourAccount = By.cssSelector("div[class='login-form'] > h2");
    private final By signup_loginButton = By.xpath("//a[@href='/login']");
    private final By emailfield =By.name("email");
    private final By passwordfield =By.name("password");
    private final By submitBottun =By.xpath("//button[@data-qa='login-button']");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage navigateToSignupLoginPage(){
        ElementsAction.click(driver,signup_loginButton);
        return this;
    }
    public LoginPage assertLoginPage(String expectedResult){
        Assert.assertEquals(driver.findElement(LoginToYourAccount).getText(), expectedResult);
        return this;

    }
    public LoginPage enteremail(String email){
        ElementsAction.sendKeys(driver,emailfield,email);
        return this;

    }
    public LoginPage enterPassword(String password){
        ElementsAction.sendKeys(driver,passwordfield,password);
        return this;

    }
    public LoginPage submitLogin(){
        System.out.println("hi");
        driver.findElement(submitBottun).click();

        System.out.println("bye");
        return this;

    }


}
