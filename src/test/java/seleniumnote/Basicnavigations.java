package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basicnavigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

       WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.automationtesting.in/Frames.html");
		driver.navigate().to("https://qac.moneymart.ca/home");
		
		driver.manage().window().maximize(); // Maxmize the window
		
		Thread.sleep(5000);
		Actions act =new Actions(driver);
		
		act.click(driver.findElement(By.xpath("//span[text()='Sign In / Sign Up']"))).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("emailAddress")).sendKeys("josefapotaro31@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("potaro@123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[contains(text(),'Installment Loan')]")).click();
        
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
        
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
          driver.navigate().refresh();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());

		
		
	}

}
