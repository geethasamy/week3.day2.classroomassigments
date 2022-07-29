package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnlist {
/*
 * Classroom Assignment 1: (List)
1) Go to https://amazon.in
2) Type phones
3) Print price of every phone
4) Print the lowest price !
Time: 20 minutes
Hints: 
Look what is common locator for all price info of every phone. 
Use Collection sort to get the lowest price 
(make sure the stored values are in Integer to support sorting)
Integer.parseInt
 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<Integer> listofphones = new ArrayList<Integer>();
		List<WebElement> elementss = driver.findElements(By.className("a-price-whole"));
		//int value =elementss.size();
        String text;
		for (int i = 0; i < elementss.size(); i++) {
			
			text =elementss.get(i).getText();
			text=text.replace(",", "");
			//System.out.println(text);
			int parseint=Integer.parseInt(text);
			listofphones.add(parseint);
		}
		Collections.sort(listofphones);
		System.out.println("Lowest Prices " +listofphones.get(0));
		
//		System.out.println(value);
//		elementss.ge
//		listofphones.addAll(elementss);
//		System.out.println(elementss);
		
//		for (int i = 0; i < args.length; i++) {
//			
//		}
		
		

	}

}
