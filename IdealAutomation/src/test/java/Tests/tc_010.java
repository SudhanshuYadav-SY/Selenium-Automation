package Tests;

import Bases.TC_LF_010;
import Pages.tc_lf_010;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_010 extends TC_LF_010
{

    @Test(priority = 2)
    public void validateLogin() throws InterruptedException
    {
        tc_lf_010 tc = new tc_lf_010(driver);
        tc.enterUsername("amotooricap8@gmail.com");
        tc.enterPassword("12345");
        Thread.sleep(4000);
        tc.clickLogin();
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='content']/h2[1]")).isDisplayed(),"InValid Login");
        driver.navigate().back();                                               //Go-Back to Previous Page
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"My Account");
    }
}