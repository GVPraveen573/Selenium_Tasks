package seleniumtasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("bangalore");
		Thread.sleep(2000);
		List<WebElement> a1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		System.out.println(a1.size());
		Thread.sleep(4000);
		a1.get(6).click();
		
	}

}
