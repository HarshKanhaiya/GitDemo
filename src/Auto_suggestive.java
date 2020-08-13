import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Auto_suggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.spicejet.com/");
		dr.manage().window().maximize();
        System.out.println(dr.findElements(By.xpath("//input[@type='checkbox']")).size());
        
        Assert.assertFalse(dr.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(dr.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		dr.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//System.out.println(dr.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(dr.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Thread.sleep(2000L);
		dr.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");
		Thread.sleep(3000L);
		Select ch=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Child")));
		
		dr.findElement(By.id("ctl00_mainContent_ddl_Child")).getText();
		
		ch.selectByIndex(1);
		Thread.sleep(2000L);
		Select inf=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		inf.selectByIndex(3);
		
		dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		//System.out.println(dr.findElement(By.id("ctl00_mainContent_ddl_Infant")).getText());
		
		Thread.sleep(2000L);
		
		Select cur=new Select(dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		cur.selectByVisibleText("USD");
		Thread.sleep(2000L);
		
		dr.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
		Assert.assertEquals(dr.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "3 Adult, 1 Child, 3 Infant");
		System.out.println(dr.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys(Keys.ENTER);
		

	}

}
