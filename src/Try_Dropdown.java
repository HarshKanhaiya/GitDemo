import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Try_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver dp=new ChromeDriver();
		dp.get("https://www.spicejet.com/");
		dp.manage().window().maximize();
		dp.findElement(By.id("divpaxinfo")).click();
		dp.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		dp.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")).click();
		
		Select r=new Select(dp.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		r.selectByValue("6");
		
		Select child=new Select(dp.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByIndex(3);
		
		Select infact=new Select(dp.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		infact.selectByVisibleText("4");
		System.out.println(dp.findElement(By.id("ctl00_mainContent_ddl_Infant")).getText());
		
		
		dp.close();
		/*Select se= new Select(dp.findElements(By.id("ctl00_mainContent_ddl_Adult")));
		Select s=new Select(dp.findElements(By.id("ctl00_mainContent_ddl_Adult")));*/
		
	}

}
