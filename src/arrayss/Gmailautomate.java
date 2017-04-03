package arrayss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailautomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe" );
System.setProperty("webdriver.chromedriver.driver", "E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
        driver.findElement(By.cssSelector("#Email")).sendKeys("Rahul.gandhi484@gmail.com");
        driver.findElement(By.cssSelector("#next")).click();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

}
//<input id="Passwd" name="Passwd" placeholder="Password" class="" type="password">