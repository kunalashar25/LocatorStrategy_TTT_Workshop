package testcases.FormPage;

import componentFlow.formPage.FormPageFlow;
import core.driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FormPageTestCase {

    DriverManager driverManager;
    WebDriver driver;

    @BeforeSuite
    public void setup() {
        driverManager = new DriverManager();
        driver = driverManager.loadHomePage();
    }

    @AfterSuite
    public void teardown() {
        driverManager.closeBrowser(driver);
    }

    @Test
    public void submitForm() {
        new FormPageFlow(driver).submitForm();
    }


}
