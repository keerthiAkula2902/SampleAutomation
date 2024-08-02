package org.selenium;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AkFirst {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new FirefoxDriver();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//actions is a class
		//Action is a interface
		Actions act = new Actions(driver);
		Action we=(Action) act.moveToElement(driver.findElement(By.xpath("//input[@name='email']"))).build();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		String userid = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		System.out.println();
		System.out.println("**" + userid + "***");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test123");
		String url = driver.getCurrentUrl();
		String S1 = "dhinesh";

		System.out.println(url);
		if (url.contains("facebook")) {
			System.out.println("Valid url");
		} else {
			System.out.println("url launch failed");
		}
		if (userid.contains("abc")) {
			System.out.println("Valid userid");
		} else {
			System.out.println("invalid userid");
		}
		// driver.close();
		// driver.quit();
	}

	protected void first1() {
		System.out.println("testing first class");

	}
}
