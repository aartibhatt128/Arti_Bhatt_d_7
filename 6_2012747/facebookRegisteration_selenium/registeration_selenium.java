package Webdriverprgs;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class fbregistration {
    public WebDriver driver;
  @Test
  public void function() {
     
    
    driver.findElement(By.xpath("//*[@value='First Name']")).sendKeys("arti");
    driver.findElement(By.xpath("//*[@value='Last Name']")).sendKeys("bhatt");
   
    driver.findElement(By.id("u_0_5")).sendKeys("artibhatt128@mail.com");
   
    driver.findElement(By.id("u_0_8")).sendKeys("artibhatt128@mail.com");
    driver.findElement(By.id("u_0_a")).sendKeys("arti128");
    new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@name='birthday_day']"))).selectByVisibleText("3");
   
    new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByValue("10");
   
    new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByValue("1999");
    driver.findElement(By.xpath("//*[@id='u_0_g']/span[1]/label")).click();
    driver.findElement(By.xpath("//*[@id='u_0_i']")).click();
      
  }
  @BeforeTest
  public void beforeTest() {
  driver = new FirefoxDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
 