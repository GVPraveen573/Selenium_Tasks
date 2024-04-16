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
		//driver.findElement(By.linkText("Your Orders")).click();
		driver.findElement(By.className("a-box-inner")).click();

	}

}
