package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element_HtmlPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement LN=driver.findElement(By.name("name3"));
		//LN.click();
		boolean b1=LN.isSelected();
		
		if (b1==false)
		{
			LN.click();
		}
				
				
		
		
		
		
		 
		
	/*	WebElement CB1=driver.findElement(By.name("name[i]"));
		WebElement CB2=driver.findElement(By.name("name[i]"));
		WebElement CB3=driver.findElement(By.name("name[i]"));
	/*	for (int i=1;i<=3;i++)
		{
		WebElement CB=driver.findElement(By.name("name[i]"));
		System.out.println(CB);
		if (CB.isDisplayed() && CB.isEnabled() && CB.isSelected())
		{
		System.out.println(CB);
		}
		
		}*/
		
		}



	}


