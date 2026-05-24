package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage clickRegister() {
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        waitForElementToBeClickable(registerLink);
        registerLink.click();
        return new RegistrationPage(driver);
    }

    public AccountsOverviewPage login(String username, String password) {
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();
        return new AccountsOverviewPage(driver);
    }

    public HomePage logout() {
        WebElement logoutLink = driver.findElement(By.linkText("Log Out"));
        waitForElementToBeClickable(logoutLink);
        logoutLink.click();
        return this;
    }
}
