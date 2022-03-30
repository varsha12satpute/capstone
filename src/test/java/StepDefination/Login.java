package StepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	@Given("Sam is on the login page")
	public void sam_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user is on the login page");
	    System.setProperty("webdriver.chrome.driver","C:\\\\install\\\\chromedriver_win32_99\\\\chromedriver.exe");

	    driver= new ChromeDriver();
	    driver.get("http://localhost:8080/FlyAway/login");
	    driver.manage().window().maximize();
	}
	@When("Sam enters {string} and {string}")
	public void sam_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user enters UN and Password");
	    WebElement username = driver.findElement(By.name("email_id"));
	    username.sendKeys("user@user.com");
	    WebElement pwd = driver.findElement(By.name("pwd"));
	    pwd.sendKeys("user");
	}
	@When("Sam clicks on Login")
	public void sam_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();System.out.println("user clicks on Login");
	    WebElement login = driver.findElement(By.tagName("button"));
	    // driver.findElement(By.tagName("button"));
	    login.click();
	}
	@Then("Sam should be able to Login successfully")
	public void sam_should_be_able_to_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		List<WebElement> lstLogout=driver.findElements(By.linkText("Logout"));
	    String actStatus;
	    if(lstLogout.size()>0) {
	        actStatus= "Login Pass";
	    }
	    else {
	        actStatus= "Login Fail";
	    }
	}
	@Then("Sam should navigate to {string}")
	public void sam_should_navigate_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();

		List<WebElement> lstLogout=driver.findElements(By.linkText("Logout"));
	    String actStatus;
	    if(lstLogout.size()>0) {
	        actStatus= "Login Pass";
	    }
	    else {
	        actStatus= "Login Fail";
	}
	}
}
	





	
	




