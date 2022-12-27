package com.phuongtrinh.apilearing;

import com.phuongtrinh.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {

    public static void main(String[] args) {
        final String testUrl = "https://the-internet.herokuapp.com/login";
        WebDriver driver = Webdriver.getChromeDriver();

        driver.get(testUrl);
        driver.manage().window().maximize();

        WebElement usernameElem = driver.findElement(By.id("username"));
        WebElement passwordElem = driver.findElement(By.id("password"));
        WebElement loginBtnElem = driver.findElement(By.cssSelector("[type='submit']"));

        usernameElem.sendKeys("tomsmith");
        passwordElem.sendKeys("SuperSecretPassword!");
        loginBtnElem.click();
    }
}
