package com.test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class First {

	    public static void main(String[] args) throws InterruptedException {  
			System.setProperty("webdriver.chrome.driver", "D:\\selinium\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("youtube"); 
			driver.manage().window().maximize();
			//Delay execution for 5 seconds to view the maximize operation
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
			Thread.sleep(5000);
			System.out.println("googlesearch success");
			driver.close();
	    } 
}
