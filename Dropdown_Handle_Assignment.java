package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handle_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement categ_dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(categ_dd);
		s1.selectByValue("search-alias=stripbooks");
		//driver.findElement(By.id("twotabsearchtextbox")).
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World War");
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
