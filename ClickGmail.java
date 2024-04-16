package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.linkText("Gmail (opens a new tab)")).click();
		//driver.findElement(By.name("login")).click();


	}

}
