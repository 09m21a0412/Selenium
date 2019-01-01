package edureka;

//facebook registering

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class dropdown {
	
	 
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","K:\\Edu\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.name("firstname")).sendKeys("karthik");
		//driver.findElement(By.cssSelector("#u_0_r")).sendKeys("karthik");
		
		// .....different ways of writing id element usig css selector
		//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("karthik"); // working
		 //driver.findElement(By.cssSelector("#email")).sendKeys("karthik");//working.......
		
		//......diff ways of writing class element using css selector
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("karthik");// working
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("karthik");// working.......
		
		driver.findElement(By.name("firstname")).sendKeys("karthik");
		driver.findElement(By.name("lastname")).sendKeys("challa");
		driver.findElement(By.name("reg_email__")).sendKeys("kchalla412@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("kchalla412@gmail.com");
		Select select = new Select(driver.findElement(By.name("birthday_day")));
		select.selectByVisibleText("19");
		
		Select mnth = new Select(driver.findElement(By.id("month")));
		mnth.selectByVisibleText("Apr");
		
		Select yer = new Select(driver.findElement(By.id("year")));
		yer.selectByVisibleText("1991");
	
				driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//input[@value='2']")).click();
				
				driver.findElement(By.name("websubmit")).click();
				
				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kchalla412@gmail.com");
				driver.findElement(By.name("websubmit")).click();
		
				
				
	//Select select = new Select(driver.findElement(By.id("day")));
	//select.selectByVisibleText("1");
	
		
	
		
	}

}
