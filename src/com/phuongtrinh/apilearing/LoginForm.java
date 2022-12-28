package com.phuongtrinh.apilearing;

import com.phuongtrinh.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginForm {

    public static void main(String[] args) {
        final String testUrl = "https://the-internet.herokuapp.com/login";
        WebDriver driver = Webdriver.getChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(testUrl);
        driver.manage().window().maximize();

        WebElement usernameElem = driver.findElement(By.id("username"));
        WebElement passwordElem = driver.findElement(By.id("password"));
        WebElement loginBtnElem = driver.findElement(By.cssSelector("[type='submit']"));

        usernameElem.sendKeys("tomsmith");
        passwordElem.sendKeys("SuperSecretPassword");
        loginBtnElem.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash-messages")));

        driver.findElement(By.id("___wrong_value"));
        driver.quit();

    }
}
