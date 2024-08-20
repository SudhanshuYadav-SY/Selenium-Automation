package Tests;


import Bases.TC_LF_003;
import Pages.tc_lf_003;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_003 extends TC_LF_003
{

    @Test(priority = 2)
    public void validateLogin() throws InterruptedException
    {
        tc_lf_003 tc = new tc_lf_003(driver);
        tc.enterUsername("xyzabc123@gmail.com");
        tc.enterPassword("12345");
        Thread.sleep(4000);
        tc.clickLogin();
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']")).getText(),"Warning: No match for E-Mail Address and/or Password.","You Entered InValid Credentials!!");
    }
}
