package com.phuongtrinh.apilearing;

import com.phuongtrinh.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        final By dropdownSelector = By.id("dropdown");
        

        Select select = new Select(driver.findElement(dropdownSelector));
        select.selectByVisibleText("Option 1");
        select.selectByValue("1");
        select.selectByIndex(1);

        select.selectByVisibleText("Option 2");
        select.selectByValue("2");
        select.selectByIndex(2);

        driver.quit();
    }
}
