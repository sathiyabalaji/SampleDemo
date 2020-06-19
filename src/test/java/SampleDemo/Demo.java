package SampleDemo;
//insert

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {
	
	//static driver
	
		@Test(priority=1)
		public void Demo() throws IOException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Balaji");
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Sridharan");
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("s.balaji80@gmail.com");
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("9790840572");
		driver.findElement(By.xpath("//*[@value='Male']")).click();
		driver.findElement(By.xpath("//*[@value='Cricket']")).click();
		Select Languages=new Select(driver.findElement(By.id("msdd")));
		Languages.selectByIndex(5);

		Select Skills=new Select(driver.findElement(By.id("Skills")));
		Skills.selectByIndex(5);
		Select countries=new Select(driver.findElement(By.id("countries")));
		countries.selectByIndex(5);
	//	Select country=driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--single']"));
		//country.selectByIndex(5);
		driver.findElement(By.xpath("//*[@id='yearbox']")).sendKeys("1980");
		driver.findElement(By.xpath("//*[@placeholder='Month']")).sendKeys("06");
		driver.findElement(By.xpath("//*[@id='daybox']")).sendKeys("07");
		driver.findElement(By.id("firstpassword")).sendKeys("Balaji");
		driver.findElement(By.id("secondpassword")).sendKeys("Balaji");
		driver.findElement(By.id("submitbtn")).click();
		
		//driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("9790840572");
		//driver.findElement(By.xpath("//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
		//driver.findElement(By.xpath("//*[@id='pie_register']/li[3]/div/div/input[1]")).click();


		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File("./Screenshots/LaunchApp.png"));
		//driver.toggleWifi();
}

}