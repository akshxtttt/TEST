import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC02_ValidateSaleAmount {
    @Test
    public void ValidateSaleAmount() throws InterruptedException {
        //
        Selenide.open("https://platform.rewaatech.com/en/login");

        //identifies the element and clicks on it
        Selenide.$(By.xpath("//button[@label=\"Eng\"]")).click();
        //validate language has changed
        Selenide.$(By.xpath("//label[contains(text(),'Sign into your account')]"))
                .shouldBe(Condition.visible);

        // fill email and password
        Selenide.$(By.xpath("//input[@id='email']"))
                .sendKeys("app3@mailinator.com");
        Selenide.$(By.xpath("//input[@type='password']"))
                .sendKeys("Test@123");


        //click on login button
        Selenide.$(By.xpath("//button[@type='submit']")).click();

        //validate if user has logged id
        Selenide.$(By.xpath("//h4[contains(text(),'Dashboard')]"))
                .shouldBe(Condition.visible);

        //validating sales amount
        Selenide.$(By.xpath("//div[@class='target-sales']//span[contains(@class,'target-text')]"))
                .shouldBe(Condition.text("9,800.08 "));


    }
}
