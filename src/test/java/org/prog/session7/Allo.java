package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Allo {

    private WebDriver driver;

    @BeforeSuite


    public void alloCall() {
        driver = new ChromeDriver();
    }

    @Test
    public void myAllo() {

        driver.get("https://allo.ua/");
        WebElement find = driver.findElement(By.id("search-form__input"));
        find.sendKeys("iphone");
        find.sendKeys(Keys.ENTER);
        driver.quit();


    }

    @AfterSuite

    public void goDown() {

        if (driver != null) {
            driver.quit();

        }
    }


}
