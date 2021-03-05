

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium 
{
static WebDriver driver ;
int a;

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/");
		driver.manage().window().maximize();
		
		chapterOne(driver);
		chapterTwo(driver);
		
		chapterThree(driver);
		chapterFour(driver);
		chapterEight(driver);
		driver.close();
		
		}
		
	//chapterone page validation details 
		public  static void chapterOne(WebDriver driver) throws Exception 
		{
			
			
			driver.findElement(By.xpath("//a[@href= '/chapter1']")).click();
			pageTitle( driver,"Selenium: Beginners Guide");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='radiobutton']")).click();
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("D:\\User Files - Dont Delete This Folder\\Documents\\sem 7\\DIP\\Selenium_assignment\\Chapter1.png"));
			driver.findElement(By.xpath("//a[text()='Home Page']")).click();//returns back to homepage 
		}
		//chaptertwo page validation details 
				public  static void chapterTwo(WebDriver driver) throws Exception 
				{
					
					
					driver.findElement(By.xpath("//a[@href= '/chapter2']")).click();
					pageTitle( driver,"Selenium: Beginners Guide");
					Thread.sleep(3000);
					
					File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshot, new File("D:\\User Files - Dont Delete This Folder\\Documents\\sem 7\\DIP\\Selenium_assignment\\Chapter2.png"));
					driver.findElement(By.xpath("//a[text()='Index']")).click();//returns back to home page 
				}
		//chapterthree page validation details 
		public static void chapterThree(WebDriver driver) throws Exception 
		{
			driver.findElement(By.xpath("//a[@href= '/chapter3']")).click();
			pageTitle(driver,"Selenium: Beginners Guide");
			Thread.sleep(3000);
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("D:\\User Files - Dont Delete This Folder\\Documents\\sem 7\\DIP\\Selenium_assignment\\Chapter3.png"));
			driver.findElement(By.xpath("//a[text()= 'Index']")).click();
		}
		//chapterfour  page validation details 
		public static void chapterFour(WebDriver driver) throws Exception 
		{
			driver.findElement(By.xpath("//a[@href= '/chapter4']")).click();
			pageTitle(driver,"Selenium: Beginners Guide");
			Thread.sleep(3000);
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("D:\\User Files - Dont Delete This Folder\\Documents\\sem 7\\DIP\\Selenium_assignment\\Chapter4.png"));
			driver.findElement(By.id("index")).click();
		}
		public static void chapterEight(WebDriver driver) throws Exception 
		{
			driver.findElement(By.xpath("//a[@href= '/chapter8']")).click();
			pageTitle(driver,"Selenium: Beginners Guide");
			Thread.sleep(3000);
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("D:\\User Files - Dont Delete This Folder\\Documents\\sem 7\\DIP\\Selenium_assignment\\Chapter8.png"));
			driver.navigate().back();
			
			
		}
		
		//To get page title
		public static void pageTitle(WebDriver driver,String expectedTitle) 
		{
			String  actualTitle = driver.getTitle();
		
			if(actualTitle.equals(expectedTitle)) 
			{
				
				
				System.out.println(" pagetitle are same ");
			}
			else 
			{
				
				
				System.out.println(" pagetitle are not  same ");
			}
			
		}
	}

