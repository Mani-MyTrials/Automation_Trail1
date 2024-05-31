package Selenium_One;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a840035\\eclipse-workspace\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
try {
		driver.manage().window().maximize();		
		driver.get("https://www.flipkart.com/");	
		
		driver.findElement(By.className("_3RX0a-")).click();
		driver.findElement(By.linkText("/account/login?ret=/viewcart%3FexploreMode%3Dtrue%26preference%3DFLIPKART")).click();
		//driver.findElement(By.className("wsejfv")).click();
		
		String srcPage = driver.getWindowHandle();
		Alert pop = driver.switchTo().alert();
		System.out.println(pop.getText());
		pop.accept();
		pop.dismiss();
		driver.switchTo().window(srcPage);
		
}
//catch (InterruptedException e) {
//	 throw new RuntimeException(e);}
	
	
finally {
	driver.quit();
}
	}
}
