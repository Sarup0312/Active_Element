package com.mm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activee 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\soft\\chrome_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("runs");
		
		System.out.println("Chrome browser is opened successfully");

		
	}

}
