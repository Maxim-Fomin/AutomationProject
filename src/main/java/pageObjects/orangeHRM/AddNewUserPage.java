package pageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewUserPage {

    @FindBy(how = How.XPATH, using = "//div[@class='orangehrm-card-container']/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")
    public WebElement btn_userRole;

    @FindBy(how = How.CSS, using = "div[class='oxd-grid-2 orangehrm-full-width-grid']>div:nth-child(3)>div>div:nth-child(2)>div>div>div:nth-child(2)")
    public WebElement btn_userStatus;

    @FindBy(how = How.XPATH, using = "//div[@class='oxd-autocomplete-wrapper']/div/input")
    public WebElement txt_employeeName;

    @FindBy(how = How.CSS, using = "div[role='listbox']>div>span")
    public WebElement btn_employeeOptions;

    @FindBy(how = How.XPATH, using = "//div[@class='oxd-form-row']/div/div[4]/div/div[2]/input")
    public WebElement txt_userName;

    @FindBy(how = How.CSS, using = "div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell']>div>div:nth-child(2)>input")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "div[class='oxd-form-row user-password-row']>div>div:nth-child(2)>div>div:nth-child(2)>input")
    public WebElement txt_confirmPassword;

    @FindBy(how = How.XPATH, using = "//button[@type ='submit']")
    public WebElement btn_save;

    @FindBy(how = How.XPATH, using = "//p[@class='oxd-userdropdown-name']")
    public WebElement text_nameAdmin;

    @FindBy(how = How.CSS, using = "div[class='oxd-toast-content oxd-toast-content--success']>p")
    public WebElement txt_success;



}
