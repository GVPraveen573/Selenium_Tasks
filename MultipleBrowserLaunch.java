package seleniumtasks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleBrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver1=new ChromeDriver();
		driver.get("https://www.google.com");
		driver1.get("https://www.facebook.com");
		String title=driver.getTitle();
		String title1=driver1.getTitle();
		System.out.println("Edge:" +title);
		System.out.println("Chrome:" +title1);
		//driver.close();
		//driver1.close();

	}

}
