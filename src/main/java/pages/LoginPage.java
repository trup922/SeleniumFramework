package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public By getUsernName(){
     return By.id("user-name");
    }

    public boolean isLoaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(getUsernName())).isDisplayed();
    }

    public void login(String username  , String password) {
        driver.findElement(getUsernName()).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("btn_action")).click();
    }

    public void open() {
        open(" ");
    }
}
