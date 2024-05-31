package Selenium_One;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_It {
	
	public static void main(String[] args) {
		
        // Setting the path to my ChromeDriver       
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\a840035\\\\eclipse-workspace\\\\chromedriver-win64\\\\chromedriver.exe");
      
     // Created a new instance of the ChromeDriver       
	 WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {

            //  Opens the Flipkart website
            	driver.get("https://www.flipkart.com/");

            	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //  Types "laptop" in website search bar by finding the name element and clicks submit
            	WebElement searchBox = driver.findElement(By.name("q"));
            	searchBox.sendKeys("laptop");
            	searchBox.submit();

            //  Clicks on one of the search results to view the product details
            	String parentWindow = driver.getWindowHandle();
            //	System.out.println("Parent Window: "+parentWindow);
            	WebElement productResult = driver.findElement(By.className("_4rR01T"));
            	productResult.click();                   
                       
            // Added window handles method to access the next page
            	Set<String> allPages = driver.getWindowHandles();
            	for(String page:allPages){
            		if(!page.equals(parentWindow)){
            			driver.switchTo().window(page);
            			Thread.sleep(2000);
            			driver.navigate().refresh();
               
            // Included Pin Code option to make sure a product is available       
                 WebElement pincode = driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]"));
                 pincode.sendKeys("502001");
                 pincode.submit();
                 
            // Sleep time to make sure the Pincode is identified                
                 Thread.sleep(2000);
                 
            // Clicks Add to Cart Button       
                 WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
                 addToCartButton.click();
           }
       }
                       
            // Clicks on Place Order Button
            	WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button/span"));
            	placeOrder.click();
            
            	Thread.sleep(3000);
            
            	WebElement mobileNumberField = driver.findElement(By.xpath("//input[@type='text']"));
            	
            	 // Using Scanner to take manual entries from the console              
                Scanner scanner = new Scanner(System.in);
        //    	 String mobileNumber = scanner.nextLine();
            	 mobileNumberField.sendKeys("9989310522");
            	
            	 Thread.sleep(20000);
            	 
            	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button/span")).click();
            	
            	WebElement otpField = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh _17N0em']"));

            	String otp = scanner.nextLine();

                // Enter the OTP into the corresponding field
                otpField.sendKeys(otp);                
                Thread.sleep(30000);
                scanner.close();
                // Continue with the login process, for example, click on the login button
                WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit'] span"));
                loginButton.click();
                
                Thread.sleep(5000);            	
            
            // To add a new Address
            	WebElement addAddress = driver.findElement(By.xpath("//div[@class='_1P2-0f']"));
            	addAddress.click();
            
            //  Enter valid shipping information (name,phone,address, city, state, and zipcode)
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
           
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            
        } finally {
            // Close the browser window
           //  driver.quit();
        }
    }
}
