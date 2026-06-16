package org.prog.session8;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class AlloObjectTest {

    private final WebDriver driver;

    public AlloObjectTest(WebDriver driver) {
        this.driver = driver;
    }


    @Step("Load page")
    public void LoadPage() {
        driver.get("https://allo.ua/");
    }

    @Step("Find & fill in data")
    public void FindAndInsertData() {
        WebElement input = driver.findElement(By.id("search-form__input"));
        input.sendKeys("iphone");
        input.sendKeys(Keys.ENTER);


    }

    @Step("Wait for sign")
    public void WaitingAndLooking() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'₴')]")));


    }


}
