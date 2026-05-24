package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.StringUtils;

public class LoginAfterRegistrationTest extends BaseTest {

    @Test
    public void testLoginAfterRegistration() {
        String username = StringUtils.getRandomString(8);
        String password = StringUtils.getRandomString(8);

        new HomePage(driver)
                .clickRegister()
                .enterFirstName("John")
                .enterLastName("Doe")
                .enterAddress("123 Main St")
                .enterCity("Anytown")
                .enterState("CA")
                .enterZipCode("12345")
                .enterPhone("5551234567")
                .enterSsn("123-45-6789")
                .enterUsername(username)
                .enterPassword(password)
                .clickRegister()
                .getSuccessMessage();

        boolean isLogoutDisplayed = driver.findElements(By.linkText("Log Out")).size() > 0;
        Assert.assertTrue(isLogoutDisplayed, "Після реєстрації користувач не залогінений");
    }
}
