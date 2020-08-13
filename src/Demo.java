import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");

		//it will invoke driver by which browser is invoked
	WebDriver drive=new ChromeDriver();
	
	String var=new String();
	
	String urlname=new String();
	
	drive.get("https://demo.govalidation.net/authentication/login/with-social");
	
	var=drive.getTitle();
	
	System.out.println(var);  // validate page title
	
	System.out.println(drive.getCurrentUrl());//validate the url
	drive.findElement(By.name("email")).sendKeys("usernamea1");
	drive.findElement(By.name("password")).sendKeys("Password!@#4");
	drive.findElement(By.linkText("Forgot Password"));
	
	//System.out.println(drive.getPageSource());
	drive.get("http://google.com");
	System.out.println(drive.getTitle());
	
	drive.get("http://yahoo.com");
	System.out.println(drive.getTitle());
	drive.navigate().back();//navigate to previous page
	System.out.println(drive.getTitle());
	drive.close();//close the current browser
	//drive.quit();
	
	
	
}
}