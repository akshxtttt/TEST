package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginPage {
    private Object langButton;
    private SelenideElement languageButton;
    private SelenideElement engLanguageButton =  Selenide.$(By.xpath("//button[@label=\"Eng\"]"));

    /**
     *
     */
    public void clickOnLanguageButtonV1(){
        //logic to click on it
        languageButton =  Selenide.$(By.xpath("//button[@label=\"Eng\"]"));
        languageButton.click();
    }

    /**
     *When locator is present as soon as the page loads
     */

    public void clickOnLanguageButtonV2(){
        //logic to click on it
        engLanguageButton.click();
    }

    /**
     * When this locator is used only once
     */

    public void clickOnLanguageButtonV3(){
        //logic to click on it
        Selenide.$(By.xpath("//button[@label=\"Eng\"]")).click();
    }

    public void validateLanguageIsEnglish(){
        //validate language has changed
        Selenide.$(By.xpath("//label[contains(text(),'Sign into your account')]"))
                .shouldBe(Condition.visible);
    }

    public void enterEmail(String email){
        Selenide.$(By.xpath("//input[@id='email']"))
                .sendKeys(email);
    }

    public void enterPassword(String password){
        Selenide.$(By.xpath("//input[@type='password']"))
                .sendKeys(password);
    }

    public void clickLogin(){
        Selenide.$(By.xpath("//button[@type='submit']")).click();
    }

    public void loginWith(String email, String password){
        //enter email,password and click on login button
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

}
