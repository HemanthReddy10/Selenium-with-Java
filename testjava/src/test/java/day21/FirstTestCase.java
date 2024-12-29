package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		WebDriver driver = new ChromeDriver();

		
        driver.get("https://demo.opencart.com/");
        String title=driver.getTitle();
        if(title.equals("Your Store")) {
        	System.out.println("Passed");
        	
        }
        else {
        	System.out.println("Failed");
        }
        driver.close();
	}

}
