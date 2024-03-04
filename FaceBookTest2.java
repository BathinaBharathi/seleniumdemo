package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Accountpage;
import pages.LoginPage;

public class FaceBookTest2 {

	public static WebDriver driver;
	LoginPage login;
	Accountpage account;
	
	@Given("User naviagte to facbook page")
	public void user_naviagte_to_facbook_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}

	@Given("Enter Username, password and Click login button")
	public void enter_username_password_and_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		login = new LoginPage(driver);
		login.enterUserName("saikrishna");
		login.enterPassword("krishna123");
		login.loginbutton();
		
	}

	@Then("verify the Invalid error message")
	public void verify_the_invalid_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		account = new Accountpage(driver);
		account.enterPassword("");
		
		
	}
	
	@Given("user navigates to Facebook")
	public void user_navigates_to_facebook() {
	    
		System.out.println("user_navigates_to_facebook");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

	@When("I enter Username as {string} and Password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
	    
		System.out.println("This is my login username "+username);
		System.out.println("this is my password "+password);
		driver.findElement(By.id("email")).sendKeys(username);
	      driver.findElement(By.id("pass")).sendKeys(password);
	      driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() {
	    
		System.out.println("login_should_be_unsuccessful");
		if(driver.getCurrentUrl().equalsIgnoreCase(
		         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
		            System.out.println("Test Pass"); 
		      } else { 
		         System.out.println("Test Failed"); 
		      }
		      driver.close(); 
	}
	
	@Given("user navigates to gmail")
	public void user_navigates_to_gmail() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter these details {string}, {string} , {string} ,{string}")
	public void i_enter_these_details(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the home page")
	public void verify_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}

