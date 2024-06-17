package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class DashboardPage {
    private String headerLocator = "//h4[contains(text(),\'Dashboard\')]";
    private String salesCountLocator = "//div[@class=\"sales-transactions h-full\"]//span[contains(@class,\"target-text\")]";
    public void validateDashboardPage(){
        Selenide.$(By.xpath(headerLocator)).shouldBe(Condition.visible);
    }

    public void validateSalesCount(String expectedCount){
        Selenide.$(By.xpath(salesCountLocator)).shouldBe(Condition.text(expectedCount));
    }


}
