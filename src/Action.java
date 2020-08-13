import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver act=new ChromeDriver();
		
		act.get("https://www.amazon.in/");
		act.manage().window().maximize();
		
		WebElement move=act.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement text=act.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions a=new Actions(act);
		
	a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(move).build().perform();
		
		a.moveToElement(move).contextClick().build().perform();
		//a.moveToElement(move).contextClick(target).build().perform();
		
		
	}

}
