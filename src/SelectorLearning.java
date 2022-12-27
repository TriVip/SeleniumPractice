import com.phuongtrinh.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorLearning {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        //find element by CSS
        WebElement usernameCssSelector = driver.findElement(By.cssSelector("#username"));
        usernameCssSelector.sendKeys("Phuong.Trinh CSS Selector |");

        //find element by ID
        WebElement usernameIDSelector = driver.findElement(By.id("username"));
        usernameIDSelector.sendKeys("Phuong.Trinh ID Selector|");

        //find element by Xpath
        WebElement usernameXpathSelector = driver.findElement(By.xpath("//input[@name='username']"));
        usernameXpathSelector.sendKeys("Phuong.Trinh Xpath Selector");

        //handle an array of element
        WebElement usernameElem = driver.findElement(By.xpath("//input"));
        usernameElem.sendKeys("Mistake Xpath");

        WebElement pwdCssSelector = driver.findElement(By.cssSelector("#password"));
        pwdCssSelector.sendKeys("1234");
    }
}
