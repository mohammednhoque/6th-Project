package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.* ;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	WebDriver driver;
	
	@Given("^browser open$")
	public void browser_open() {
	System.out.println("step 1 - Open browser ");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

	@And("user is in google search")
	public void user_is_in_google_search() {
		System.out.println("step 2 - search box must be open"); 
		driver.get("http:/google.com");
	}

	@When("user enter text in edit box")
	public void user_enter_text_in_edit_box() {
		System.out.println("step 3 - type in edit box");
		driver.findElement(By.name("q")).sendKeys("Bangladesh");
	}

	@And("hits the enter")
	public void hits_the_enter() {
		System.out.println("step 4 - hit enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigate search result")
	public void user_is_navigate_search_result() {
		System.out.println("step 5 - selected page will be open");
		driver.getPageSource().contains("WikiPedia");
		driver.quit();
		
	}


}
