package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Tagname_Htmlage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.tagName("a"));
		sign.click();

	}

}
