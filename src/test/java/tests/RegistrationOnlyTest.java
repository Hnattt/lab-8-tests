package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.StringUtils;

public class RegistrationOnlyTest extends BaseTest {

    @Test
    public void testRegistrationOnly() {
        String username = StringUtils.getRandomString(8);
        String password = StringUtils.getRandomString(8);

        String successMsg = new HomePage(driver)
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

        Assert.assertTrue(successMsg.contains("Your account was created successfully"));
    }
}
