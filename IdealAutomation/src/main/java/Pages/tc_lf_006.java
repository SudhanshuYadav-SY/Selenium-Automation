package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_lf_006
{
    WebDriver driver;
    @FindBy(linkText = "Forgotten Password")
    WebElement forgotPwd;

    public tc_lf_006(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void forgotPwd()
    {
        forgotPwd.click();
    }
}