import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver re=new ChromeDriver();
		re.get("https://www.rediff.com/");
		re.findElement(By.cssSelector("a[class*='signin']")).click();
		//re.findElement(By.id("//input[contains(@id,'login')]")).sendKeys("Success");
		re.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("Success");
		
	}

}
