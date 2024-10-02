package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		WebElement we=driver.findElement(By.id("products-dd-toggle"));
	
		act.moveToElement(we).click().build().perform();
		Thread.sleep(3000);
		WebElement we1=driver.findElement(By.xpath("//div[@class=' bstack-mm-sub-nav-tabcol']//span[text()='Live']"));
		act.clickAndHold(we1).build().perform();
		
		
		
	}
	

}
