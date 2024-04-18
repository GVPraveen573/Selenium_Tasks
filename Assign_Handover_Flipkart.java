package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_Handover_Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Fashion")).click();
//		WebElement e1=driver.findElement(By.linkText("Fashion"));
//		Actions a1=new Actions(driver);        
//		a1.moveToElement(e1).perform();

	}

}
