package practice.selenium_basics;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			String urltitle=driver.getTitle();
			
			System.out.println("URL TITLE:"+urltitle+"\ntitle length:"+urltitle.length());
			System.out.println("current url:"+driver.getCurrentUrl());
			String pagesourcelen=driver.getPageSource();
			System.out.println("page source length:"+pagesourcelen.length());
//			driver.getPageSource();
			System.out.println("new source length:"+pagesourcelen.charAt(7));
			
			driver.quit(); 

	}

}


