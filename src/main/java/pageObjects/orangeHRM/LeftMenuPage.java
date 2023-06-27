package pageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LeftMenuPage {

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][1]")
    public WebElement btn_admin;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][2]")
    public WebElement btn_pim;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][3]")
    public WebElement btn_leave;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][4]")
    public WebElement btn_time;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][5]")
    public WebElement btn_recruitment;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][6]")
    public WebElement btn_myInfo;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][7]")
    public WebElement btn_performance;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][8]")
    public WebElement btn_dashboard;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][9]")
    public WebElement btn_directory;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper'][10]")
    public WebElement btn_maintenance;

    @FindBy(how = How.XPATH, using = "//li[@class='oxd-main-menu-item-wrapper']")
    public List<WebElement> rows;

    @FindBy(how = How.CSS, using = "input[placeholder='Search']")
    public WebElement txt_search;

}
