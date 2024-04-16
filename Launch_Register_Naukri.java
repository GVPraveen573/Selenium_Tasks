package seleniumtasks;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch_Register_Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.name("google-register")).click();
		//driver.close();
		//driver.quit();
		
		

	}

}
