package Com.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	WebDriver driver;
	By searcharea =By.id("srchword");
	String url ="https://www.rediff.com/";
	public void ops () {
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath +"/geckodriver-v0.29.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement searchfild = driver.findElement(searcharea);
		searchfild.clear();
		searchfild.sendKeys("cyclone");
		searchfild.submit();
		driver.quit();              
		
	}
	public static void main(String[] args) {
		Selenium S = new Selenium();
		S.ops();
	}
}

