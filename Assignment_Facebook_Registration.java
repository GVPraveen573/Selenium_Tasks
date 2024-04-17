package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Facebook_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		//driver.findElement(By.linkText("First name")).sendKeys("Praveen");
		//driver.findElement(By.id("u_3_9_k8")).sendKeys("Praveen");
		driver.findElement(By.name("reg_email__")).sendKeys("VenkataPraveen@gmail.com");

	}

}
