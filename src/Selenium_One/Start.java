package Selenium_One;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
  

public class Start {

	
	public static void main(String[] args) {  
	        
	System.setProperty( "webdriver.chrome.driver","C:\\Users\\a840035\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver(); 
      
// Launch website  
    driver.get("http://www.google.com/");  
 // Maximize the browser
    driver.manage().window().maximize();
    
    driver.get("https://www.flipkart.com/");
    
    new WebDriverWait(driver, Duration.ofSeconds(30));
          
    // Click on the search text box and send value  
  //  driver.findElement(By.id("input")).sendKeys("javatpoint tutorials");  click()
          
    // Click on the search button  
    driver.findElement(By.className("Pke_EE")).sendKeys("laptops"); 
    driver.findElement(By.className("_2iLD__")).click();
    driver.findElement(By.className("_4rR01T")).click();
  //  new WebDriverWait(driver, Duration.ofSeconds(30));
   
//    driver.findElement(By.className("_1p3MFP.dTTu2M")).click();
    
  //  for (String handle : driver.getWindowHandles()) {

   //     driver.switchTo().window(handle);}

   driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
    
  //  WebElement button = driver.findElement(By.className("_2KpZ6l._2U9uOA._3v1-ww"));
   // button.click();
    
   // driver.findElement(By.className("_3iRXzi")).click();
    
    driver.quit();
    
}


	}
