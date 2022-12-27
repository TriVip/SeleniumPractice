package com.phuongtrinh.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
    public static WebDriver getChromeDriver(){

        String path = System.getProperty("user.dir");
        String chromeDriverPath = path + "/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        return new ChromeDriver();
    }
}
