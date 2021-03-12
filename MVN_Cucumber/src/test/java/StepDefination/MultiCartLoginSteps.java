package StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiCartLoginSteps {
	WebDriver driver;
	
	
	@Given("webpage should be open with select browser")
	public void webpage_should_be_open_with_select_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
	}

	@And("hit in the login button")
	public void hit_in_the_login_button() {
		driver.findElement(By.id("dLabellogin")).click();
	    
	}

	@When("^put the  (.*) and (.*)$")
	public void put_the_username_and_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("hit on login button")
	public void hit_on_login_button() {
		driver.findElement(By.id("jqLogin")).click();
	  
	}

	@Then("user will be in the home page")
	public void user_will_be_in_the_home_page() {
	String text=driver.findElement(By.xpath("//span[contains(text(),'Jame')]")).getText();
	System.out.println(text);
	  Assert.assertEquals("JAMES WILLIAMS", text);
	}

	@And ("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	

}
