package day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersDemo {
	public static void main(String args[]) {
		ChromeDriver driver=new ChromeDriver();
		
		driver .get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
//		name
//		driver.findElement(By.name("search")).sendKeys("Mac");
		
//		id
//		boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
//		System.out.print(logoDisplayStatus);
		
//		link text& partial link text
//		driver.findElement(By.linkText("Tablets")).click();
//		driver.findElement(By.partialLinkText("Table")).click();
		
		
//      TagName & Class
//		List<WebElement>headerLinks=driver.findElements(By.className("list-inline-item"));
//		System.out.println("Total Number of header links"+headerLinks.size());
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links "+links.size());
		
		
		
		
		
		
		
		
		
		
		
	}

}
