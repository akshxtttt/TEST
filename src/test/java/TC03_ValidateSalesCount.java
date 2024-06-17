import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.example.DashboardPage;
import org.example.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC03_ValidateSalesCount {
    @Test
    public void ValidateSalesCount() throws InterruptedException {
        //
        Selenide.open("https://platform.rewaatech.com/en/login");

        //identifies the element and clicks on it
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnLanguageButtonV2();
        loginPage.validateLanguageIsEnglish();

        loginPage.loginWith("app3@mailinator.com","Test@123");

        DashboardPage dashboardPage =  new DashboardPage();
        dashboardPage.validateDashboardPage();
        dashboardPage.validateSalesCount("110");

        Thread.sleep(5000);

    }
}
