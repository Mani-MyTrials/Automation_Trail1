package Selenium_One;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_xpath {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\a840035\\\\eclipse-workspace\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		try {
		//driver.get("https://resumetrick.com");
		driver.get("https://www.ironspider.ca/");
		
		driver.findElement(By.linkText("www.GoDaddy.com")).click();
		//driver.findElement(By.xpath("//*[contains(@class,'LC20lb MBeuO DKV0Md')]"));
		// driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]")).click();	
		
		
//		String actualTitle = driver.getTitle();
//		
//		String expectedTitle = "resumeprepare";
//		
//		Assert.assertEquals(actualTitle, expectedTitle);
		
	//	driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary btn-lg mx-auto')]")).click();
		//Thread.sleep(5000);
		
		//WebElement upload = driver.findElement(By.xpath("//*[contains(@class,'add-new-btn text-center')]"));
		//upload.click();
		//WebElement country = driver.findElement(By.xpath("//*[contains(@id,'el-id-9475-33')]"));	
		//country.sendKeys("India");
		
				/*	Script to scroll down the page
	    			driver.get("https://www.amazon.com”");
					JavascriptExecutor js = (JavascriptExecutor) driver;	 
					js.executeScript("window.scrollBy(0,1000)"); 
				 */
	//	driver.findElement(By.cssSelector("#el-id-9475-33")).sendKeys("India");
		//driver.findElement(By.cssSelector(“input#email”)).sendKeys(“myemail@email.com”);
		//#el-id-9475-33
	}
		
	catch(Exception e)	{
		
		
	}
	finally {
		driver.quit();
	}	
	}
	
	}