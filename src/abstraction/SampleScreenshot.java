package abstraction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SampleScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Madesh\\Software\\chromedriver.exe");

		driver = new ChromeDriver();

		// Edit URL

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		System.out.println(

				"\n********************************This script is designed for Add a product into cart using Amazon Site!********************************");

		System.out.println("Make My Trip URL Opened");

		// Sign in
		File screenshotDist = new File("D:\\Madesh\\Sample Screenshot\\Sample1.jpge");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// screenshot
		Files.copy(screenshot, screenshotDist);
		System.out.println("Screenshot Path");
	}

}
