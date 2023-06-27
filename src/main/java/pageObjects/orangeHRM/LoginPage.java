package pageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.NAME,using = "username")
    public WebElement txt_username;

    @FindBy(how = How.NAME,using = "password")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public  WebElement btn_login;

}
