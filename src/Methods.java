import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.govalidation.net/authentication/login/with-social");
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password!@#4");
	    driver.findElement(By.xpath("//button[@type='button']")).click();*/
		
	    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Krishna");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password!@#4");
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
		
	}

}
