package testCases;

import java.util.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario_1_14 {
	
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
		
//		WebElement department = driver.findElement(By.id("department"));
//		dropDown = new Select(department);
		
		WebElement date = driver.findElement(By.id("Date1"));
		dropDown = new Select(date);
		dropDown.selectByIndex(1);
		
	}
	
	@Test
	public void test() {
		
		List <WebElement> listOfWebEl = driver.findElements(By.xpath("//select[@id='department']//option"));
		List <String> listOFWebElString = toListOfStrings(listOfWebEl);
		
		Assert.assertTrue(listOFWebElString.size()==9);
		
		
	}
	
	private static List <String> toListOfStrings(List<WebElement> WebElements) {
        List <String> actualTopMenuList = new ArrayList<>();
        for( WebElement element :  WebElements  ) {
            actualTopMenuList.add(element.getText());
        }
        return actualTopMenuList;
    }

}
