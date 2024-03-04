package seleniumnote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NweTabHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://amazon.com");
		String parentWidnowId = driver.getWindowHandle();
		
		driver.getWindowHandle(); //- this will be return only current window id

		driver.switchTo().newWindow(WindowType.TAB);//sel 4.x
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();//close child window
		
		//back to parent window:
		driver.switchTo().window(parentWidnowId);
		System.out.println(driver.getTitle());

	}

}
