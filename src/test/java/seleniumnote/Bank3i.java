package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank3i {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	        driver.navigate().to("http://10.30.73.56:5601/3ibank/index.html");
	        
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("Bharathi");
	        driver.findElement(By.id("password")).sendKeys("Bh@123");
	        driver.findElement(By.id("card")).sendKeys("1214");
	        driver.findElement(By.id("login_btn")).click();
	        
	        Thread.sleep(70000);
driver.findElement(By.xpath("//h5[text()='Let us finance the entrepreneur in you']//following::button[1")).click();
	}

}
