package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage enterFirstName(String firstName) {
        driver.findElement(By.id("customer.firstName")).sendKeys(firstName);
        return this;
    }

    public RegistrationPage enterLastName(String lastName) {
        driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
        return this;
    }

    public RegistrationPage enterAddress(String address) {
        driver.findElement(By.id("customer.address.street")).sendKeys(address);
        return this;
    }

    public RegistrationPage enterCity(String city) {
        driver.findElement(By.id("customer.address.city")).sendKeys(city);
        return this;
    }

    public RegistrationPage enterState(String state) {
        driver.findElement(By.id("customer.address.state")).sendKeys(state);
        return this;
    }

    public RegistrationPage enterZipCode(String zipCode) {
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        return this;
    }

    public RegistrationPage enterPhone(String phone) {
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(phone);
        return this;
    }

    public RegistrationPage enterSsn(String ssn) {
        driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
        return this;
    }

    public RegistrationPage enterUsername(String username) {
        driver.findElement(By.id("customer.username")).sendKeys(username);
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        driver.findElement(By.id("customer.password")).sendKeys(password);
        driver.findElement(By.id("repeatedPassword")).sendKeys(password);
        return this;
    }

    public AccountSuccessPage clickRegister() {
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        return new AccountSuccessPage(driver);
    }
}
