package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
		
		driver .get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize(); //maximize the browser window
		
//		tag id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
//		Tags are optional
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		driver.findElement(By.cssSelector("input[placeholder='Search store']"));
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
		
		
		

	}

}
