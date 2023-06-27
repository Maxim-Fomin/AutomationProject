package pageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminMainPage {

    @FindBy(how = How.XPATH, using = "//div[@class='oxd-table-card']")
    public List<WebElement> rows;

    @FindBy(how = How.CSS, using = "div[class='orangehrm-horizontal-padding orangehrm-vertical-padding']>span")
    public WebElement txt_recordsFound;

    @FindBy(how = How.XPATH, using = "//div[@class='orangehrm-header-container']/button")
    public WebElement btn_addUsers;

    @FindBy(how = How.CSS, using = "button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    public WebElement btn_confirmDeleteUser;
}
