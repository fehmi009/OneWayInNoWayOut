package testCases;

import java.sql.Time;
import java.util.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario_1_33 {
	
	WebDriver driver;
	Select dropDown;
	Scanner input = new Scanner(System.in);
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/irfan/Downloads/TimeSheet.html");
		driver.findElement(By.id("fname")).sendKeys("Zach");
		driver.findElement(By.id("lname")).sendKeys("Drake");
		
		WebElement department = driver.findElement(By.id("department"));
		dropDown = new Select(department);
		dropDown.selectByIndex(8);
		
		WebElement date = driver.findElement(By.id("Date1"));
		dropDown = new Select(date);
		dropDown.selectByIndex(1);
		
	}
	
	@Test
	public void test() {
		
		WebElement time_in = driver.findElement(By.id("in1"));
		dropDown = new Select(time_in);
		dropDown.selectByIndex(11);
		
		WebElement time_out = driver.findElement(By.id("out1"));
		dropDown = new Select(time_out);
		dropDown.selectByIndex(1);
		
		String str_timeIn = driver.findElement(By.id("in1")).getText();
		String str_timeOut = driver.findElement(By.id("out1")).getText();
		
//		Assert.assertTrue(Time.valueOf(str_timeIn)<Time.valueOf(str_timeOut));
		
	}

}
