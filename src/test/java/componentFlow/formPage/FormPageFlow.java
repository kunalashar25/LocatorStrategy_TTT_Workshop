package componentFlow.formPage;

import com.github.javafaker.Faker;
import components.formPage.FormPage;
import components.formPage.IFormPage;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class FormPageFlow {

    private WebDriver driver;
    private Faker faker;

    public FormPageFlow(WebDriver driver) {
        this.driver = driver;
        faker = new Faker();
    }

    public void fillFormDetails() {
        IFormPage iFormPage = new FormPage(driver);

        // get user ID
        String userId = iFormPage.getUserId();
        System.out.println("Auto-Generated userId:: "+userId);

        // fill text fields
        iFormPage.fillFullName(faker.name().fullName());
        iFormPage.fillEmail(faker.internet().emailAddress());
        iFormPage.fillCurrentAddress(faker.address().fullAddress());

        // submit form
        iFormPage.submit();

        // verify links
        iFormPage.clickForgotUserName();
        iFormPage.clickForgotPassword();
        iFormPage.clickForgotEmail();
        iFormPage.clickGoToHome();
    }
}
