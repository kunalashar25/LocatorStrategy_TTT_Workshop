package components.formPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FormPage implements  IFormPage{

    private WebDriver driver;

    public FormPage(WebDriver driver){
        this.driver = driver;
    }

    @Override
    public String getUserId() {
        WebElement element = driver.findElement(USER_ID_TEXTBOX_DISABLED);
        if(element.isEnabled())
            Assert.assertTrue(false,"UserId textbox is not disabled");
        return driver.findElement(USER_ID_TEXTBOX_DISABLED).getAttribute("value");
    }

    @Override
    public void fillFullName(String fullName) {
        driver.findElement(FULL_NAME_TEXTBOX).sendKeys(fullName);
    }

    @Override
    public void fillEmail(String email) {
        driver.findElement(EMAIL_TEXTBOX).sendKeys(email);

    }

    @Override
    public void fillCurrentAddress(String currentAddress) {
        driver.findElement(CURRENT_ADDRESS_TEXTAREA).sendKeys(currentAddress);

    }

    @Override
    public void submit() {
        driver.findElement(SUBMIT_BUTTON).click();
    }

    @Override
    public void clickForgotUserName() {
        driver.findElement(FORGOT_USERNAME_LINK).click();
    }

    @Override
    public void clickForgotPassword() {
        driver.findElement(FORGOT_PASSWORD_LINK).click();
    }

    @Override
    public void clickForgotEmail() {
        driver.findElement(FORGOT_EMAIL_LINK).click();
    }

    @Override
    public void clickGoToHome() {
        driver.findElement(GO_TO_HOME_LINK).click();
    }
}
