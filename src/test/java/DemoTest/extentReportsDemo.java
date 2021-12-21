package DemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportsDemo {

	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		ExtentTest test1 = extent.createTest("DemoTest", "Check facebook login");
		
		test1.log(Status.INFO, "Starting test case");
		




		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		test1.pass("starting google.com");

		driver.findElement(By.id("email")).sendKeys("01934404292");
		driver.findElement(By.id("pass")).sendKeys("01683408675");
		driver.findElement(By.name("login")).click();

		driver.manage().window().maximize();
		test1.pass("close the browser");
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
		test1.info("testcase passed");
		extent.flush();

	}


}


