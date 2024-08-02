package org.selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AkSecond extends AkFirst {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
//		Launch the desired application

		driver.get("https://www.amazon.com");

		// Scroll down to the desired location

	//	js.executeScript("window.scrollBy(0,2000)");*/
		String s1="Welcome to my world";
		String a[]=s1.split("e");
		System.out.println(a.length);
		for(String s:a) {
			System.out.println(s);
		}
		System.out.println(a[2].trim());

	}

}
