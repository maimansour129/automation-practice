//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.*;
//public class demo {
//    private WebDriver driver;
//
//    private String Url ="https://automationexercise.com/";
//    // element locators
//    private final By homeText = By.linkText("Home");
//    private final By signupButton = By.linkText("Signup / Login");
//    private final By newUsersignuptext = By.cssSelector("div[class='signup-form'] > h2 ");
//    private final By nameFiled =By.name("name");
//    private final By emailField = By.cssSelector("input[data-qa='signup-email']");
//    private final By SubmitSignupButton = By.cssSelector("button[data-qa='signup-button']");
//
//    private final By accountInformationtext = By.cssSelector("div[class='login-form'] > h2>b ");
//
//    private final By genderFiled =By.id("id_gender2");
//    private final By nameTextFiled =By.id("name");
//    private final By passwordFiled =By.id("password");
//    private final By daysFiled =By.id("days");
//    private final By monthsFiled =By.id("months");
//    private final By yearsFiled =By.id("years");
//    private final By newsletterCheckbox =By.id("newsletter");
//    private final By specialOffersCheckbox =By.id("optin");
//    private final By FirstnameFiled =By.id("first_name");
//    private final By LastnameFiled =By.id("last_name");
//    private final By addressFiled =By.id("address1");
//    private final By countryFiled =By.id("country");
//    private final By stateFiled =By.id("state");
//    private final By cityFiled =By.id("city");
//    private final By ZipCodeFiled =By.id("zipcode");
//
//    private final By mobileNumberFiled =By.id("mobile_number");
//    private final By createAccountButton =By.cssSelector("button[data-qa='create-account']");
//
//    private final By accountCreatedtext = By.cssSelector("div[class='col-sm-9 col-sm-offset-1'] > h2>b");
//
//
//
//
//    public void urlNavigation(){
//        driver.navigate().to(Url);
//    }
//
//    @BeforeMethod()
//    public void test1(){
//        driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        urlNavigation();
//
//    }
//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//    }
//
//    @Test()
//    public void test2(){
//
//        verifyHomePageVisibility( "Home");
//
//        signUpButtonClick();
//        assertOnnewUserSignupPage("New User Signup!");
//        fillSignupForm("Mai","mai854223@gmail.com");
//
//        signUpsubmit();
//
//        verifyEnterInformationVisibility("ENTER ACCOUNT INFORMATION");
//
//        fillAccountInfo("mai","maimansour","6","September","2000","mai","elnady","nasr city","India","egypt","cairo","11254","011111111");
//
//        CreateAccountClick();
//
//        assertAccountCreatedTextVisibility("ACCOUNT CREATED!");
//
//
//    }
//    public void verifyHomePageVisibility(String expectedResult) {
//        String homePageIsVisible = driver.findElement(homeText).getText();
//        Assert.assertEquals(homePageIsVisible, expectedResult);
//    }
//    public void assertOnnewUserSignupPage(String expectedResult) {
//        String newUsersignupIsVisible = driver.findElement(newUsersignuptext).getText();
//        Assert.assertEquals(newUsersignupIsVisible, expectedResult);
//    }
//    public void verifyEnterInformationVisibility(String expectedResult) {
//        String EnterInformationIsVisible = driver.findElement(accountInformationtext).getText();
//        Assert.assertEquals(EnterInformationIsVisible, expectedResult);
//    }
//    public void assertAccountCreatedTextVisibility(String expectedResult) {
//        String accountCreatedIsVisible = driver.findElement(accountCreatedtext).getText();
//        Assert.assertEquals(accountCreatedIsVisible, expectedResult);
//    }
//    public void signUpButtonClick(){
//        driver.findElement(signupButton).click();
//    }
//    public void fillSignupForm(String name , String email){
//        driver.findElement(nameFiled).sendKeys(name);
//        driver.findElement(emailField).sendKeys(email);
//    }
//    public void signUpsubmit(){
//        driver.findElement(SubmitSignupButton).click();
//    }
//    public void fillAccountInfo(String name ,String email ,String days,String months, String years,String Firstname,String lastname ,String address , String Countrry, String state , String city ,String zip ,String mobile){
//        driver.findElement(genderFiled).click();
//
//        driver.findElement(nameTextFiled).sendKeys(name);
//        driver.findElement(passwordFiled).sendKeys(email);
//        Select day = new Select(driver.findElement(daysFiled));
//        day.selectByVisibleText(days);
//
//        Select month = new Select(driver.findElement(monthsFiled));
//        month.selectByVisibleText(months);
//
//        Select year = new Select(driver.findElement(yearsFiled));
//        year.selectByVisibleText(years);
//
//        driver.findElement(newsletterCheckbox).click();
//        driver.findElement(specialOffersCheckbox).click();
//
//        driver.findElement(FirstnameFiled).sendKeys(Firstname);
//        driver.findElement(LastnameFiled).sendKeys(lastname);
//        driver.findElement(addressFiled).sendKeys(address);
//
//        Select country = new Select(driver.findElement(countryFiled));
//        country.selectByVisibleText(Countrry);
//
//        driver.findElement(stateFiled).sendKeys(state);
//        driver.findElement(cityFiled).sendKeys(city);
//
//        driver.findElement(ZipCodeFiled).sendKeys(zip);
//        driver.findElement(mobileNumberFiled).sendKeys(mobile);
//    }
//    public void CreateAccountClick(){
//        driver.findElement(createAccountButton).click();
//    }
//}