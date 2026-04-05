package practice.selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//ctrl +shift+ O it imports required packages
		driver.manage().window().maximize();
		driver.get("https://www.safeway.com/");
		Thread.sleep(1000);
		//form
		driver.findElement(By.name("search-form")).isDisplayed();
		Thread.sleep(3000);
		//a
		driver.findElement(By.id("auth_signin_link")).click();
//		//h1
		String lptitle=driver.findElement(By.className("landing-pg__title")).getText();
		System.out.println("landing page title:"+lptitle);
//		//button
//		driver.manage().window().setSize(new Dimension(375, 812)); 
//		Thread.sleep(2000);
//		driver.findElement(By.className("secondary-bar-hamburger")).click();
//		Thread.sleep(1500);
//		driver.manage().window().maximize();
		
//		//span
		driver.get("https://www.safeway.com/");
		String str=driver.findElement(By.tagName("span")).getText();
		System.out.println("The word in the span tag: "+str+"\nword length:"+str.length());
//		//ul
		WebElement ul=driver.findElement(By.className("t_nav__categories"));
		System.out.println("UL text:\n" + ul.getText());
//		//li
		String txt=driver.findElement(By.className("level1")).getText();
		System.out.println("text:"+txt);
//		
//		//img
		driver.findElements(By.className("flex-card__image"));
//		//input
		driver.get("https://www.safeway.com/shop/deals/sale-prices.html");
		String y=driver.findElement(By.tagName("input")).getAttribute("type");
		System.out.println(y);
		//p
		driver.get("https://www.safeway.com/shop/product-details.960329957.html");
		String productdes=driver.findElement(By.className("text-m")).getText();
		System.out.println("Product description:"+productdes);
		//table
		driver.findElement(By.className("w-100"));
		//tr
		driver.findElement(By.className("product-details__product-shopping-options__svg"));
		System.out.println("output printed.....");
		
//		driver.findElement(By.)
		Thread.sleep(2000);
		driver.quit();
	}

}
