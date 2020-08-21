package components.formPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface IFormPage {

    By USER_ID_TEXTBOX_DISABLED = By.id("userId");
    By FULL_NAME_TEXTBOX = By.className("userName");
    By EMAIL_TEXTBOX = By.cssSelector("[type='email']");
    By CURRENT_ADDRESS_TEXTAREA = By.id("address");
    By SUBMIT_BUTTON = By.id("submit");
    By FORGOT_USERNAME_LINK = By.className("forgotUsername");
    By FORGOT_PASSWORD_LINK = By.cssSelector("[class^=forgotPassword]");
    By FORGOT_EMAIL_LINK = By.cssSelector("[class^=forgotPassword] + a");
    By GO_TO_HOME_LINK = By.xpath("//div[@name='links']/a");

    public String getUserId();

    public void fillFullName(String fullName);

    public void fillEmail(String email);

    public void fillCurrentAddress (String currentAddress);

    public void submit();

    public void clickForgotUserName();

    public void clickForgotPassword();

    public void clickForgotEmail();

    public void clickGoToHome();
}
