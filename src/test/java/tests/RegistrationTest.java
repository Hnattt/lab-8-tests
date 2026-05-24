package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.StringUtils;

public class RegistrationTest extends BaseTest {

    @Test
    public void testRegistrationWithPageObject() {
        String username = StringUtils.getRandomString(8);
        String password = StringUtils.getRandomString(8);
        String firstName = "John";
        String lastName = "Doe";
        String address = "123 Main St";
        String city = "Anytown";
        String state = "CA";
        String zipCode = "12345";
        String phone = "5551234567";
        String ssn = "123-45-6789";

        String successMessage = new HomePage(driver)
                .clickRegister()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterAddress(address)
                .enterCity(city)
                .enterState(state)
                .enterZipCode(zipCode)
                .enterPhone(phone)
                .enterSsn(ssn)
                .enterUsername(username)
                .enterPassword(password)
                .clickRegister()
                .getSuccessMessage();

        Assert.assertTrue(successMessage.contains("Your account was created successfully"),
                "Реєстрація не вдалася. Отримано: " + successMessage);
    }
}
