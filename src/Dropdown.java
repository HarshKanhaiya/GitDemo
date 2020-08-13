import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver drop=new ChromeDriver();
		drop.get("https://www.spicejet.com/");
		//drop.findElement(By.cssSelector("input[id='ct100-mainContent_ddl_originStation_CTXT']")).click();;
		
		//drop.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//drop.findElement(By.xpath("//input[contains(@name,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
		drop.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		drop.findElement(By.xpath("//a[@value='IXL']")).click();
		drop.findElement(By.xpath("//a[@value='IXL']")).click();
		
		drop.close();
	}
	//input[id='ct100-mainContent_ddl_originStation_CTXT']
}
