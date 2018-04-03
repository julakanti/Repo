package NG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class orange {
public WebDriver driver;
  @Test(groups={" orange"})
  public void login() {
  driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
  driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
  driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
  
  }
  @BeforeMethod
  public void url () {
	driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
  }
  @AfterMethod
public void close(){
driver.quit();	
}
 
  }


