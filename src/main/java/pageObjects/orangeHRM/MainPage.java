package pageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//div[@class='oxd-topbar-header-title']/span/h6")
    public WebElement head_Dashboard;

    @FindBy(how = How.CSS, using = "div[class='oxd-grid-3 orangehrm-dashboard-grid']")
    public List<WebElement> list_Dashboard;



}
