package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig_Dropdown_keys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement FN= driver.findElement(By.id("searchDropdownBox"));
		for (int i=0;i<12;i++) {
		FN.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);		
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World War");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		

	}

}
