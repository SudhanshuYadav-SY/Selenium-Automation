package Tests;

import Pages.tc_lf_001;
import Bases.TC_LF_001;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_001 extends TC_LF_001
{

    @Test(priority = 2)
    public void validateLogin() throws InterruptedException
    {
        tc_lf_001 tc = new tc_lf_001(driver);
        tc.enterUsername("amotooricap8@gmail.com");
        tc.enterPassword("12345");
        Thread.sleep(4000);
        tc.clickLogin();
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='content']/h2[1]")).isDisplayed(),"InValid Login");
    }
}
