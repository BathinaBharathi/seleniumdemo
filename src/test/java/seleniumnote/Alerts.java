package seleniumnote;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();--Alert with OK
		
		//driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')] ")).click();//--Alert with OK and cancel
		
		//driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
				
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')] ")).click();//---Alert with text box
		
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();		
				Thread.sleep(5000);
				
				Alert alt = driver.switchTo().alert(); // Alert class define
				
				System.out.println(alt.getText());
				
			    //alt.accept();
				
				alt.dismiss();

			    Thread.sleep(5000);


	}

}
