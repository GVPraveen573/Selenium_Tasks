package seleniumtasks;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.close();  //Close only current broswer/tab 
		//driver.quit(); //Close all current tabs broswer 

	}

}
