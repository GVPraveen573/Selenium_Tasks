package seleniumtasks;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Launch {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("q")).sendKeys("india");
		driver.findElement(By.name("btnK")).click();
		String title=driver.getTitle();
		System.out.println("Edge:" +title);
		driver.close();
		
	}

}
