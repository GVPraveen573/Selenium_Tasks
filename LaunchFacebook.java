package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("VenkataPraveen.gajula@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test1234");
		driver.findElement(By.name("login")).click();

	}

}
