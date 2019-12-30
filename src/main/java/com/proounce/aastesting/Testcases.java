package com.proounce.aastesting;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Testcases {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		        //open application
		driver.get("http://localhost:3000/"); 
		        //login page
		WebElement var=driver.findElement(By.id("username"));
		var.sendKeys("SAEVANS");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("welcome123"); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div/form/label/span[1]/span[1]/input")).click();
		driver.findElement(By.xpath(".//*[@class='MuiButton-label']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@title='AASF']")).click();
		//driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
//		WebElement drop1= driver.findElement(By.xpath("//*[@id=\"menu-role\"]/div[3]/ul/li[1]"));
//		 Select dropdown1=new Select(drop1);
//		 List originalList=new ArrayList();
//	      List <WebElement> options=dropdown1.getOptions();
//	       for(WebElement e:options) {
//	    	   originalList.add(e.getText());
//	       }
//	    	   System.out.println(originalList); 
		 
		/*// dropdown1.selectByVisibleText("Requisition Creator");
		 WebElement drop2= driver.findElement(By.xpath(".//*[@role='option']"));
		 Select dropdown2=new Select(drop2);
		 dropdown2.selectByVisibleText("OFFICE OF PERFORMANCE MANAGEMENT & CHIEF FINANCIAL OFFICER");
		 WebElement drop3= driver.findElement(By.xpath("//*[@id=\"menu-fiscalyear\"]/div[3]/ul/li[1]]"));
		 Select dropdown3=new Select(drop3);
		 dropdown3.selectByVisibleText("2020");
	    driver.findElement(By.xpath(".//*[@class='MuiButton-label']")).click();  */
		 
	}
}