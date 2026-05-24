package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsOverviewPage extends BasePage {

    public AccountsOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'Accounts Overview')]"));
        waitForVisibility(header);
        return header.getText();
    }

    public BillPayPage goToBillPay() {
        WebElement billPayLink = driver.findElement(By.linkText("Bill Pay"));
        waitForElementToBeClickable(billPayLink);
        billPayLink.click();
        return new BillPayPage(driver);
    }
}
