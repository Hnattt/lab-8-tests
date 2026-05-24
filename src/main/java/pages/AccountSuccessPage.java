package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSuccessPage extends BasePage {

    public AccountSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        WebElement msg = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully')]"));
        waitForVisibility(msg);
        return msg.getText();
    }

    public BillPayPage goToBillPay() {
        WebElement billPayLink = driver.findElement(By.linkText("Bill Pay"));
        waitForElementToBeClickable(billPayLink);
        billPayLink.click();
        return new BillPayPage(driver);
    }

    public HomePage logout() {
        WebElement logoutLink = driver.findElement(By.linkText("Log Out"));
        waitForElementToBeClickable(logoutLink);
        logoutLink.click();
        return new HomePage(driver);
    }
}
