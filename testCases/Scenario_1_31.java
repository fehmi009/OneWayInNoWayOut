package testCases;

import java.util.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario_1_31 {
	
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
		
		WebElement time_in = driver.findElement(By.id("in1"));
		dropDown = new Select(time_in);
		dropDown.selectByIndex(1);
		
		WebElement time_out = driver.findElement(By.id("out1"));
		dropDown = new Select(time_out);
		dropDown.selectByIndex(1);
		
	}
	
	@Test
	public void test() {
		
		WebElement over_time = driver.findElement(By.id("over1"));
		
		String str_input = input.nextLine();
		
		over_time.sendKeys(str_input);
		
		int num_input = Integer.parseInt(str_input);
		
		Assert.assertFalse(num_input>24);
		
	}

}
