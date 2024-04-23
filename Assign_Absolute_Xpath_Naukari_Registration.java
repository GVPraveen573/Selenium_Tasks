package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Absolute_Xpath_Naukari_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		//WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.sendKeys("mobile");
		WebElement sign=driver.findElement(By.xpath("//span[.='Google']"));
		sign.click();

	}

}
