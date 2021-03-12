package locator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.Chrome.Driver", "c://ChromeDriver.exe");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		By click = By.xpath("//ul//li[@class='hl-cat-nav__js-tab'][6]");
		By listElement = By.xpath("//li[@class='b-links-accordion'][11]");
		By catagory = By.id("gh-shop-a");
		
		driver.findElement(catagory).click();
		
	String text = driver.findElement(catagory).getText();
	System.out.println(text);
	
	
driver.quit();
}}
