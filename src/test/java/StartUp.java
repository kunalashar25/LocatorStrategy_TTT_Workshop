import core.driverManager.DriverManager;
import org.openqa.selenium.WebDriver;

public class StartUp {
    public static void main(String[] args) {
        DriverManager driverManager = new DriverManager();
        WebDriver driver = driverManager.loadHomePage();






        driverManager.closeBrowser(driver);
    }
}
