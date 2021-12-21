package DemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Demo_test {

	public static void main(String[] args) {

String projectPath=System.getProperty("user.dir");
System.out.println(projectPath);
System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver.exe");


 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");

 driver.findElement(By.id("email")).sendKeys("01934404292");
 driver.findElement(By.id("pass")).sendKeys("01683408675");
 driver.findElement(By.name("login")).click();
 
 driver.manage().window().maximize();
  //driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
 //driver.close();
 //driver.quit();

	}
	
	

}
