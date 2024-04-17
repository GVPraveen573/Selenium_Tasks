package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MKT_Registartion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		WebElement FN= driver.findElement(By.id("fname"));
		FN.sendKeys("Praveen");
		FN.sendKeys(Keys.CONTROL+"a");
		FN.sendKeys(Keys.CONTROL+"c");
		WebElement LN= driver.findElement(By.id("lname"));
		LN.sendKeys(Keys.CONTROL+"v");
		WebElement Gender= driver.findElement(By.id("male"));
		Thread.sleep(2000);
		Gender.click();
		Thread.sleep(2000);
		Gender.sendKeys(Keys.ARROW_RIGHT);

	}

}
