package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.partialLinkText("Track packages")).click();
		//driver.findElement(By.className("a-list-item a-color-secondary")).click();
		driver.findElement(By.id("ap_email")).sendKeys("VenkataPraveen.gajula@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("VenkataPraveen.gajula@gmail.com");
		driver.findElement(By.id("signInSubmit")).click();
		
	}

}
