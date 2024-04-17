package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Google_Enter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
		
	}

}
