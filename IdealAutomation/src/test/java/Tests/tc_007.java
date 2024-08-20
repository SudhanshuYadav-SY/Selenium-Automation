package Tests;


import Bases.TC_LF_007;
import Pages.tc_lf_007;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_007 extends TC_LF_007
{
    @Test(priority = 3)
    public void validateLogin() throws InterruptedException
    {
        tc_lf_007 tc = new tc_lf_007(driver);
        driver.findElement(By.id("input-email")).sendKeys("amotooricap8@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.id("input-password")).sendKeys("12345");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@value='Login']")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/h2[1]")).getText());
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/h2[1]")).isDisplayed(),"You are Not Logged IN!!");
    }
}