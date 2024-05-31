package Selenium_One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Address {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\a840035\\\\eclipse-workspace\\\\chromedriver-win64\\\\chromedriver.exe");
    
    // Created a new instance of the ChromeDriver       
	 WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=true");
       
       Thread.sleep(45000);
       
    WebElement name = driver.findElement(By.name("name"));
    WebElement mobile = driver.findElement(By.name("phone"));
    WebElement addressInput = driver.findElement(By.name("addressLine1"));
    WebElement cityInput = driver.findElement(By.name("city"));
    WebElement stateInput = driver.findElement(By.name("state"));
    WebElement zipCodeInput = driver.findElement(By.name("pincode"));

//sending inputs to the found address text areas
    name.sendKeys("Your Name");
    mobile.sendKeys("Your Mobile Number");
    addressInput.sendKeys("Your Address");
    cityInput.sendKeys("Your City");
    stateInput.sendKeys("Your State");
    zipCodeInput.sendKeys("Your Zip Code");

//  Proceed to the next step
    WebElement continueButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']"));
    continueButton.click();

// Generally Laptops delivery will be Open-Box delivery so there will be Pop up mentioning it is a Open Box delivery
    driver.findElement(By.cssSelector("._2KpZ6l._1uR9yB._3dESVI")).click();
            
//  Choose a payment method (credit card)       
    WebElement payMethod = driver.findElement(By.xpath("//label[@for='CREDIT']//div[@class='_1XFPmK']"));
    payMethod.click();
}
}