package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Xpath_Relative_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement Login=driver.findElement(By.xpath("(//div)[25]"));
		Login.click();
		WebElement Phone=driver.findElement(By.xpath("(//input)[7]"));
		Phone.sendKeys("8520862473");
		WebElement Continue=driver.findElement(By.xpath("(//span)[2]"));
		Continue.click();
		WebElement Pass=driver.findElement(By.xpath("(//input)[9]"));
		Pass.sendKeys("8520862473");
		WebElement signin=driver.findElement(By.xpath("(//span)[2]"));
		signin.click();

	}

}
