package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage extends BasePage {

    public BillPayPage(WebDriver driver) {
        super(driver);
    }

    public BillPayPage enterPayeeDetails(String payeeName, String address, String city, String state, String zip, String phone) {
        driver.findElement(By.name("payee.name")).sendKeys(payeeName);
        driver.findElement(By.name("payee.address.street")).sendKeys(address);
        driver.findElement(By.name("payee.address.city")).sendKeys(city);
        driver.findElement(By.name("payee.address.state")).sendKeys(state);
        driver.findElement(By.name("payee.address.zipCode")).sendKeys(zip);
        driver.findElement(By.name("payee.phoneNumber")).sendKeys(phone);
        return this;
    }

    public BillPayPage enterAccountDetails(String accountNumber) {
        driver.findElement(By.name("payee.accountNumber")).sendKeys(accountNumber);
        driver.findElement(By.name("verifyAccount")).sendKeys(accountNumber);
        return this;
    }

    public BillPayPage enterAmount(String amount) {
        driver.findElement(By.name("amount")).sendKeys(amount);
        return this;
    }

    public BillPayCompletePage clickSendPayment() {
        driver.findElement(By.xpath("//input[@value='Send Payment']")).click();
        return new BillPayCompletePage(driver);
    }
}
