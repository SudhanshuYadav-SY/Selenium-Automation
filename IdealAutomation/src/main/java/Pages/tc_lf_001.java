package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_lf_001
{
    WebDriver driver;
    @FindBy(id="input-email")
    WebElement username;
    @FindBy(id="input-password")
    WebElement pwd;
    @FindBy(xpath = "//*[@value='Login']")
    WebElement loginBtn;

   public tc_lf_001(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }

   public void enterUsername(String uName)
   {
       username.sendKeys(uName);
   }

   public void enterPassword(String Pwd)
   {
       pwd.sendKeys(Pwd);
   }

   public void clickLogin()
   {
       loginBtn.click();
   }
}