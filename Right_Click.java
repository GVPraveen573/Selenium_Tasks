package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Right_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.id("accountNo")).sendKeys("SBI000012341234");  // id - locator
		WebElement CIF=driver.findElement(By.xpath("//input[@id='cifNo']")); // xpath
		CIF.sendKeys("8520862473");
		driver.findElement(By.name("branchCode")).sendKeys("06143"); //Name -locator 
		WebElement c=driver.findElement(By.id("selCountry"));
		Select s1=new Select(c);
		s1.selectByValue("91");
		WebElement Mobile=driver.findElement(By.xpath("//input[@id='mobileNo']"));
		Mobile.sendKeys("8520862473");
		WebElement c1=driver.findElement(By.id("txnRights"));
		Select s2=new Select(c1);
		s2.selectByIndex(2);
		driver.findElement(By.xpath("//button[@id='go']")).click();  
		
	
	}

}
