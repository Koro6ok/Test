package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage {

    @FindBy(id = "registerName")
    private WebElement inputEmailAddress;

    @FindBy(id = "FirstName")
    private WebElement inputFirstName;

    @FindBy(id = "LastName")
    private WebElement inputLastName;

    @FindBy(id = "UserPassword")
    private WebElement inputPassWord;

    @FindBy(css = "input[data-bind *= 'value: confirmPassword'] ")
    private WebElement inputConfirmPassWord;

    @FindBy(id = "Phone")
    private WebElement inputPhone;

    @FindBy(id = "OrgDisplayName")
    private WebElement inputOrganizationName;

    @FindBy(id = "signupbtn")
    private WebElement buttonVhod;

    @FindBy(xpath = ".//span[@for='UsernameOrEmail']")
    private WebElement fieldValidatorEmail;

    @FindBy(xpath = ".//span[@for='UsernameOrEmail']")
    private WebElement fieldValidatorFirstName;

    @FindBy(xpath = ".//span[@for='UsernameOrEmail']")
    private WebElement fieldValidatorLastName;

    @FindBy(xpath = ".//span[@for='UsernameOrEmail']")
    private WebElement fieldValidatorPassword;

    @FindBy(xpath = ".//span[@for='UsernameOrEmail']")
    private WebElement fieldValidatorPhone;

    @FindBy(xpath = ".//span[@for='UsernameOrEmail']")
    private WebElement fieldValidatorOrganizationName;

    @FindBy(xpath = ".//*[@class='error_ico']")
    private WebElement fieldValidatorErrorFirstName;

    @FindBy(xpath = ".//*[@class='error_ico']")
    private WebElement fieldValidatorErrorLastName;

    @FindBy(xpath = ".//span[contains(@data-bind, 'showPasswordWeaknessError')]")
    private WebElement fieldHintWeakPassword;

    @FindBy(xpath = ".//span[contains(@data-bind, 'showPasswordNormalError')]")
    private WebElement fieldHintNormalPassword;

    @FindBy(xpath = ".//span[contains(@data-bind, 'showPasswordStrongError')]")
    private WebElement fieldHintStrongPassword;

    @FindBy(xpath = ".//*[@class='error_ico']")
    private WebElement fieldValidatorCorrectPhone;

    @FindBy(xpath = ".//*[@class='error_ico']")
    private WebElement fieldValidatorErrorOrganizationName;


    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void openRegistrationPage() {
        try {
            webDriver.get("https://reverent-aryabhata-11cf33.netlify.com/");
            logger.info("Login page was opened");

        } catch (Exception e) {
            logger.info("Cannot open login Page");
            Assert.fail("Cannot open login Page");
        }
    }

    public void enterEmailAddress(String email) {
        actionsWithOurElements.enterTextInToElement(inputEmailAddress, email);
    }

    public void enterFirstName(String firstName) {
        actionsWithOurElements.enterTextInToElement(inputFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        actionsWithOurElements.enterTextInToElement(inputLastName, lastName);
    }

    public void enterPassword(String passWord) {
        actionsWithOurElements.enterTextInToElement(inputPassWord, passWord);
    }

    public void enterConfirmPassword(String confirmPassWord) {
        actionsWithOurElements.enterTextInToElement(inputConfirmPassWord, confirmPassWord);
    }

    public void enterPhone(String phone) {
        actionsWithOurElements.enterTextInToElement(inputPhone, phone);
    }

    public void enterOrganizationName(String organizationName) {
        actionsWithOurElements.enterTextInToElement(inputOrganizationName, organizationName);
    }

    public boolean isButtonVhodDisplayed() {
        return actionsWithOurElements.isElementDisplayed(buttonVhod);
    }

    public void clickButtonVhod() {
        actionsWithOurElements.clickOnElement(buttonVhod);
    }

    public boolean isFieldValidatorEmailDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorEmail);
    }

    public boolean isFieldValidatorFirstNameDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorFirstName);
    }

    public boolean isFieldValidatorLastNameDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorLastName);
    }

    public boolean isFieldValidatorPasswordDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorPassword);
    }

    public boolean isFieldValidatorPhoneDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorPhone);
    }

    public boolean isFieldValidatorOrganizationNameDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorOrganizationName);
    }

    public boolean isFieldValidatorErrorFirstNameDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorErrorFirstName);
    }

    public boolean isFieldValidatorErrorLastNameDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorErrorLastName);
    }

    public boolean isFieldHintWeakPasswordDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldHintWeakPassword);
    }

    public boolean isFieldHintNormalPasswordDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldHintNormalPassword);
    }

    public boolean isFieldHintStrongPasswordDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldHintStrongPassword);
    }

    public boolean isFieldValidatorCorrectPhone() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorCorrectPhone);
    }

    public boolean isFieldValidatorErrorOrganizationDisplayed() {
        return actionsWithOurElements.isElementDisplayed(fieldValidatorErrorOrganizationName);
    }

    public void fillRegistrationForm(String email, String firstName, String lastName, String passWord, String confirmPassword, String phone, String organizationName) {
        enterEmailAddress(email);
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPassword(passWord);
        enterConfirmPassword(confirmPassword);
        enterPhone(phone);
        enterOrganizationName(organizationName);
    }

    public void doRegistration(String email, String firstName, String lastName, String passWord, String confirmPassword, String phone, String organizationName) {
        openRegistrationPage();
        fillRegistrationForm(email, firstName, lastName, passWord, confirmPassword, phone, organizationName);
        isButtonVhodDisplayed();
        clickButtonVhod();
    }

//    public void setFirstLastName(String firstName, String lastName) {
//        openRegistrationPage();
//        enterFirstName(firstName);
//        enterLastName(lastName);
//    }

    public void setPassword(String passWord) {
        openRegistrationPage();
        enterPassword(passWord);
    }

    public void setPhone(String phone) {
        openRegistrationPage();
        enterPhone(phone);
    }
}