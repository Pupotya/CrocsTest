package CrocsTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    ChromeDriver driver;
    RegistrationPage registrationPage;
    @Before
    public void precondition(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
        driver.get("https://www.crocs.eu/on/demandware.store/Sites-crocs_eu-Site/en_ES/Login-Register");
    }
    @Test
    public void crocsTestNegativePasswordConfirm() {
        registrationPage.enterFirstName("Aristarch");
        registrationPage.enterLastName("Pushkin");
        registrationPage.enterLoginField("p123@gmail.com");
        registrationPage.enterLoginFieldConfirm("p123@gmail.com");
        registrationPage.enterUserPassword("7777777");
        registrationPage.enteruserPasswordConfirmation("1234567");
        registrationPage.clickRegiser();
        Assert.assertEquals(driver.findElement(By.id("dwfrm_profile_login_passwordconfirm-error")).getText(), "Does not match password");
    }
    @Test
    public void crocsTestNegativeEmailConfirm() {
        registrationPage.enterFirstName("Aristarch");
        registrationPage.enterLastName("Pushkin");
        registrationPage.enterLoginField("p122@gmail.com");
        registrationPage.enterLoginFieldConfirm("p121@gmail.com");
        registrationPage.enterUserPassword("7777777");
        registrationPage.enteruserPasswordConfirmation("7777777");
        registrationPage.clickRegiser();
        Assert.assertEquals(driver.findElement(By.id("dwfrm_profile_login_usernameconfirm-error")).getText(), "Email address fields must match.");
    }
    @After
    public void postcondition(){
        driver.quit();
    }

}
