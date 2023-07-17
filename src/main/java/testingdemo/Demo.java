package testingdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException
	   {
		   WebDriverManager.chromedriver().setup();
		//  System.setProperty("webdriver.chrome.driver","C:\\Users\\MonaSharma\\eclipse-workspace\\DemoQa\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/automation-practice-form");
		  //driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Bharti");		  
		  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Rani");
		  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("bharti@gmail.com");
		  
//		  JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//		  javascriptExecutor.executeScript("scroll(0,-250)");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[text()='Female']")).click();
		  driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9999955555");
		  driver.findElement(By.xpath("//*[@id='dateOfBirthInput']")).click();
		  driver.findElement(By.xpath("//*[@aria-label='Choose Tuesday, June 27th, 2023']")).click();
//		  Thread.sleep(1000);
	      WebElement subject=driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		  subject.sendKeys("English");
		  subject.sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//*[text()='Sports']")).click();
		  driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("path of file");
		  driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("jellyfish technologies,noida");
		  driver.findElement(By.xpath("//*[@class=' css-yk16xz-control']/div[@class=\" css-1hwfws3\"]")).click();
		  driver.findElement(By.xpath("//*[@class=' css-yk16xz-control']")).sendKeys(Keys.ARROW_DOWN);	  
		  driver.findElement(By.xpath("//*[@class=' css-yk16xz-control']")).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//*[text()='Submit']")).click();
}

}
