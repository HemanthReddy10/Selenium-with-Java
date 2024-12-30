package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
		
		driver .get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize(); //maximize the browser window
		
		
		//single attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		
		//multiple attribute
		
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		//input[@name='search' and @placeholder='Search']
		//input[@name='search' or @placeholder='Search']
		//
         
		String value=driver.findElement(By.xpath("//a[@title='Show products in category Electronics'][normalize-space()='Electronics']")).getText();
		System.out.println(value);
		
	}
	
}
