package com.intel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {
	
	@Test
	public void login_Test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		driver.findElement(By.name("username")).sendKeys("adangowda1995@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Adangowda@1234");
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
	}

}
