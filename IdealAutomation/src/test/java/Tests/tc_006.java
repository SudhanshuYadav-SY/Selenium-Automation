package Tests;


import Bases.TC_LF_006;
import Pages.tc_lf_006;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_006 extends TC_LF_006
{
    @Test(priority = 2)
    public void validateLogin() throws InterruptedException
    {
        tc_lf_006 tc = new tc_lf_006(driver);
        tc.forgotPwd();
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']/h1")).getText(),"Forgot Your Password?","You Didn't Clicked Forgotten Password");
    }
}