package Tests;


import Bases.TC_LF_005;
import Pages.tc_lf_005;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_005 extends TC_LF_005
{
    @Test(priority = 2)
    public void validateLogin() throws InterruptedException
    {
        tc_lf_005 tc = new tc_lf_005(driver);
        tc.clickLogin();
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']")).getText(),"Warning: No match for E-Mail Address and/or Password.","You Entered InValid Credentials!!");
    }
}