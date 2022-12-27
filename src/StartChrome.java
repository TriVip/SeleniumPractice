import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChrome {
    public static void main(String[] args) {
        WebDriver driver;
        String path = System.getProperty("user.dir");
        String chromeDriverPath = path + "/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.close();
        driver.quit();
    }

}