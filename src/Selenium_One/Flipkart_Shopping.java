package Selenium_One;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Shopping {

	 public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\a840035\\\\eclipse-workspace\\\\chromedriver-win64\\\\chromedriver.exe");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        try {
	        	
	        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        	 
	            // Step 1: Opens Flipkart website
	            driver.get("https://www.flipkart.com/");
	       	    
	           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	           
	            // Step 3: In search bar type "laptop" and press enter
	           WebElement searchBox = driver.findElement(By.name("q"));
	           searchBox.sendKeys("laptop");
	            searchBox.submit();

//	            String mainPage = driver.getWindowHandle();
//	            System.out.println("Main Page"+mainPage);
	            
	            // Step 4: Click on one of the search results to view the product details
	           WebElement productResult = driver.findElement(By.className("_4rR01T"));
	           productResult.click();
	          
//	            Set<String> allPages = driver.getWindowHandles();
//	            for(String page : allPages) {
//	            	if(!page.equals(mainPage))
//	            		{
//	            		driver.switchTo().window(page);
//	            		};
//	            	break;	           		
//	            }
//			   //       System.out.println(driver.getCurrentUrl());
	            // Step 5: Add the selected laptop to the shopping cart
	           // WebElement addToCartButton = 
		   //       driver.get("https://www.flipkart.com/acer-aspire-3-intel-core-i3-12th-gen-1215u-8-gb-512-gb-ssd-windows-11-home-a315-59-36he-thin-light-laptop/p/itmc58479d0e2330?pid=COMGRSXP6D9ANEXN&lid=LSTCOMGRSXP6D9ANEXNBYCJYM&marketplace=FLIPKART&q=laptop&store=6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=en_rDXW_Z-UIefsojA7_1xOhP6hvlw_2Fr7HW6LFZmc3l94wQin4QY6B8pfzJ-hL4mr-tQhThAAdhEDhh9bKsPUog%3D%3D&ppt=hp&ppn=homepage&ssid=nt4z3ximrk0000001710235674033&qH=312f91285e048e09");
	         
//	        // It will return the parent window name as a String
//	         String parent=driver.getWindowHandle();
//
//	           Set<String>s=driver.getWindowHandles();
//
//	           // Now iterate using Iterator
//	           Iterator<String> I1= s.iterator();
//
//	           while(I1.hasNext())
//	           {
//
//	           String child_window=I1.next();
//	           if(!parent.equals(child_window))
//	           driver.switchTo().window(child_window);
	           driver.getCurrentUrl();
	           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	           WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l._2U9uOA._3v1-ww']"));
	            addToCartButton.click();	
	           
	            // Step 6: Navigate to the shopping cart
	   //         driver.get("https://www.flipkart.com/cart");

	            // Step 7: Verify that the correct item is in the cart
	            // You can add additional verification based on the elements in the cart
		          // Number Enter
		          driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		          WebElement number = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		           number.sendKeys("9989310522");
		            number.submit();
		            
		            //Request OTP Button
		            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click(); 
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		            
	            // Step 8: Click on the "Proceed to Checkout" button
	            WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//span[normalize-space()='Place Order']"));
	            proceedToCheckoutButton.click();

	            // Step 9: On the login page, enter valid credentials (username and password) to login
	           
//	            WebElement usernameInput = driver.findElement(By.cssSelector("input._2IX_2-._2Uq6Pw._3xjgLU"));
//	            WebElement passwordInput = driver.findElement(By.cssSelector("input._2IX_2-._3mctLh._2Uq6Pw"));
//	            WebElement loginButton = driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL"));
//	            
//	            usernameInput.sendKeys("your_username");
//	            passwordInput.sendKeys("your_password");
//	            loginButton.click();

	            // Step 10: Verify that the user is successfully logged in
	            // You can add additional verification based on the elements on the next page

	            // Step 11: Enter valid shipping information (address, city, state, and zipcode)
	            WebElement addressInput = driver.findElement(By.name("address"));
	            WebElement cityInput = driver.findElement(By.name("city"));
	            WebElement stateInput = driver.findElement(By.name("state"));
	            WebElement zipCodeInput = driver.findElement(By.name("pincode"));

	            addressInput.sendKeys("Your Address");
	            cityInput.sendKeys("Your City");
	            stateInput.sendKeys("Your State");
	            zipCodeInput.sendKeys("Your Zip Code");

	            // Step 12: Proceed to the next step
	            WebElement continueButton = driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL"));
	            continueButton.click();

	            // Step 13: Choose a payment method (credit card)
	            // Implement the logic to select the credit card payment method

	            // Step 14: Verify the order summary
	            // You can add additional verification based on the elements on the order summary page

	            } 
	            finally {
	            // Close the browser window
	           driver.quit();
	 }
}  
}            

