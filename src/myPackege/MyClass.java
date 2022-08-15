package myPackege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\auto\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itgsoftware.com/");
		System.out.println("Successfully opened");
		driver.quit();
}

}
