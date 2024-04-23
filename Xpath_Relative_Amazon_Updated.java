package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Relative_Amazon_Updated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.sendKeys("mobile");
		WebElement sign=driver.findElement(By.xpath("//a[.='Mobiles']"));
		sign.click();
		
		//input[.="Hello, sign in"]
		
		
		//*[@id="twotabsearchtextbox"]

	}

}
