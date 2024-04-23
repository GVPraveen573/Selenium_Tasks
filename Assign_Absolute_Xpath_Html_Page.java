package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Absolute_Xpath_Html_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement US=driver.findElement(By.xpath("/html/body/input[1]"));
		US.sendKeys("Pravee GV");
		WebElement Hint=driver.findElement(By.xpath("/html/body/input[2]"));
		Hint.sendKeys("My name");
		WebElement pass=driver.findElement(By.xpath("/html/body/input[3]"));
		pass.sendKeys("Password");
		WebElement FN=driver.findElement(By.xpath("/html/body/form/input[1]"));
		FN.sendKeys("Praveen");
		WebElement CB1=driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
		CB1.click();
		WebElement CB2=driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
		CB2.click();
		WebElement CB3=driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
		CB3.click();
		WebElement Gen=driver.findElement(By.xpath("/html/body/input[4]"));
		Gen.click();
		WebElement CB4=driver.findElement(By.xpath("/html/body/input[6]"));
		CB4.click();
		WebElement reg=driver.findElement(By.xpath("/html/body/select/option[2]"));
		reg.click();

	}

}
