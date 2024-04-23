package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Relative_Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		WebElement UN=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		UN.sendKeys("VenkataPraveen");
		/*WebElement Pass=driver.findElement(By.xpath("(//input)[4]"));
		Pass.sendKeys("Password");
		WebElement LB=driver.findElement(By.xpath("(//button)[1]"));
		LB.click();*/
	}

}
