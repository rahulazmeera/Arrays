package arrayss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver.driver", "E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");
		
	}

}
