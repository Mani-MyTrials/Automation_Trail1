package Selenium_One;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Buy_it {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a840035\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        
	        try {
	            // Step 1: Open Flipkart website
	            driver.get("https://www.flipkart.com/");

	            // Step 2: Close the login popup if it appears
	          //  WebElement closePopup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button._2KpZ6l._2doB4z")));
	          //  closePopup.click();

	            // Step 3: Search for laptops
	            WebElement searchBox = driver.findElement(By.name("q"));
	            searchBox.sendKeys("laptop");
	            searchBox.submit();

	            // Step 4: Click on the first search result to view product details
	            WebElement productResult = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div._1AtVbE a")));
	            productResult.click();

	            driver.get("https://www.flipkart.com/acer-aspire-3-intel-core-i3-12th-gen-1215u-8-gb-512-gb-ssd-windows-11-home-a315-59-36he-thin-light-laptop/p/itmc58479d0e2330?pid=COMGRSXP6D9ANEXN&lid=LSTCOMGRSXP6D9ANEXNBYCJYM&marketplace=FLIPKART&q=laptops&store=6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=en_mBWYbmiZOVF4PLGgHPvgODa7NVcDsGvHtYVl7AT6_GEZ-98Bn6ESL0uJFmQG6xUh-tQhThAAdhEDhh9bKsPUog%3D%3D&ppt=hp&ppn=homepage&ssid=r749npxzu80000001710243514520&qH=c06ea84a1e3dc3c6");
	            
	            // Step 5: Add the laptop to the shopping cart
	            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")));
	            addToCartButton.click();

	            // Step 6: View the shopping cart
	            WebElement viewCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-link-type='cart-icon']")));
	            viewCartButton.click();

	            // Step 7: Verify the cart and proceed to checkout
	            WebElement proceedToCheckoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")));
	            proceedToCheckoutButton.click();

	            // Step 8: Log in (assuming you already have an account)
	            WebElement usernameInput = driver.findElement(By.cssSelector("input._2IX_2-._2Uq6Pw._3xjgLU"));
	            WebElement passwordInput = driver.findElement(By.cssSelector("input._2IX_2-._3mctLh._2Uq6Pw"));
	            WebElement loginButton = driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL"));
	            
	            usernameInput.sendKeys("your_username");
	            passwordInput.sendKeys("your_password");
	            loginButton.click();

	            // Step 9: Proceed to address entry (assuming you already have an address saved)
	            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL")));
	            continueButton.click();

	            // Step 10: Choose payment method, verify order summary, and complete the purchase
	            // (Note: This step may involve sensitive information and should be handled carefully)

	        } finally {
	            // Close the browser window
	            driver.quit();
	        }
	    }
	}


