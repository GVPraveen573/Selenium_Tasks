package seleniumtasks;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag1=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(3000);
		WebElement drop2=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		WebElement drag2=driver.findElement(By.xpath("//div[@id='div2']"));
		a1.dragAndDrop(drag2, drop2).perform();

	}

}
