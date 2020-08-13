import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver M=new ChromeDriver();
		M.manage().window().maximize();
		M.get("https://accounts.google.com/signup");
		M.findElement(By.xpath("//a[text()='Help']")).click();
		System.out.println(M.getTitle());
		System.out.println(M.getCurrentUrl());
		
	     Set<String> ids=M.getWindowHandles();
	     
	    iterator <String> it = ids.iterator();
	     
		String Parentid=it.next();
		System.out.println(Parentid);
		String Childid=it.next();
		M.switchTo().window(Childid);
	
	}
	

}
