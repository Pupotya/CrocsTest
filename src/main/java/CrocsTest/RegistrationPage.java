package CrocsTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private final By firstName = By.id("dwfrm_profile_customer_firstname");
    private final By lastName = By.id("dwfrm_profile_customer_lastname");
    private final By loginUserName = By.id("dwfrm_profile_login_username");
    private final By loginUserNameConfirm = By.id("dwfrm_profile_login_usernameconfirm");
    private final By password = By.id("dwfrm_profile_login_password");
    private final By passwordConfirm = By.id("dwfrm_profile_login_passwordconfirm");
    private final By clickRegister = By.name("dwfrm_profile_register");


    private WebDriver driver;
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterFirstName(String S){
        driver.findElement(firstName).sendKeys(S);
    }
    public void enterLastName(String S){
        driver.findElement(lastName).sendKeys(S);
    }
    public void enterLoginField(String S){
        driver.findElement(loginUserName).sendKeys(S);
    }
    public void enterLoginFieldConfirm(String S){
        driver.findElement(loginUserNameConfirm).sendKeys(S);
    }
    public void enterUserPassword(String S){
        driver.findElement(password).sendKeys(S);
    }
    public void enteruserPasswordConfirmation(String S){
        driver.findElement(passwordConfirm).sendKeys(S);
    }
    public void clickRegiser(){
        driver.findElement(clickRegister).click();
    }


}
