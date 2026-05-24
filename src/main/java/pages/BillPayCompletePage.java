package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillPayCompletePage extends BasePage {

    public BillPayCompletePage(WebDriver driver) {
        super(driver);
    }

    public String getCompletionMessage() {
        WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'Bill Payment Complete')]"));
        waitForVisibility(header);
        return header.getText();
    }
}
