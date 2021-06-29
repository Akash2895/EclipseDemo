package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class A {
	
	@Test
	public void checkLoginWithCorrectCredentials(){
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/JAVA/setups/Selenium_Setup/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Dashboard";
		Assert.assertEquals(actTitle, expTitle);
	}
}
